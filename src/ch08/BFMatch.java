package ch08;

public class BFMatch {

    static int bruteForceMatch(String text, String pattern){
        int tp = 0;
        int pp = 0;
        while(tp < text.length() && pp < pattern.length()){
            if(text.charAt(tp) == pattern.charAt(pp)){
                tp++;
                pp++;
            }else{
                tp = tp - pp +1;
                pp = 0;
            }
        }
        if(pp==pattern.length()){
            return tp-pp;
        }else{
            return -1;
        }

    }

    public static void main(String[] args) {
        String text = "ABCEFRFGFGFGDGGRSGKEOLSBFFFFFMGMTKTLTLS";
        String pattern = "SBF";
        int charAt = bruteForceMatch(text, pattern);
        String matchedPattern = text.substring(charAt, charAt + pattern.length());
        System.out.println(matchedPattern);
    }
}
