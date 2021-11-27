package ch08;

public class BMMatch {
    static int boyerMooreMatch(String txt, String pat){
        int pp=0;
        int tp=0;
        int patLen = pat.length();
        int[] skip = new int[Character.MAX_VALUE];
        for (int i = 0; i < skip.length; i++) {
            skip[i] = patLen;
        }
        for(int i = 0; i<patLen ; i++){
            skip[pat.charAt(i)] = patLen - i -1;
        }
        pp = tp = patLen-1;
        while(tp < txt.length()){
            while(txt.charAt(tp) == pat.charAt(pp)){
                tp--;
                pp--;
            if(pp==0) return tp;

            }

            tp += skip[txt.charAt(tp)];
            pp=patLen-1;
        }
        if(pp==patLen){
            return pp-tp;
        }


        return -1;
    }

    public static void main(String[] args) {
        String text = "ABCEFRFGFGFGDGGRSGKEOLSBFABCABDFFFFMGMTKTLTLS";
        String pattern = "ABCABD";
        int charAt = boyerMooreMatch(text, pattern);
        String matchedPattern = text.substring(charAt, charAt + pattern.length());
        System.out.println(matchedPattern);
    }
}
