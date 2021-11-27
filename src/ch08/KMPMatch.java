package ch08;

import java.util.Arrays;

public class KMPMatch {

    static int kmpMatch(String txt, String pat){
        int pt = 1;
        int pp = 0;
        int[] skip = new int[pat.length()+1];

        skip[pt] =0;
        while(pt<pat.length()){
            if(pat.charAt(pt) == pat.charAt(pp)){
                skip[++pt]=++pp;
            }else if(pp==0){
                skip[++pt]=0;
            }else{
                pp = 0;
            }
        }
        pt=pp=0;
        while(pt<txt.length() && pp < pat.length()){
            if(txt.charAt(pt) == pat.charAt(pp)){
                pt++;
                pp++;
            }else if(pp==0){
                pt++;
            }else{
                pp=skip[pp];
            }
        }
        if(pp == pat.length()){
            return pt-pp;
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "ABCEFRFGFGFGDGGRSGKEOLSBFABCABDFFFFMGMTKTLTLS";
        String pattern = "ABCABD";
        int charAt = kmpMatch(text, pattern);
        String matchedPattern = text.substring(charAt, charAt + pattern.length());
        System.out.println(matchedPattern);
    }

}
