package ch08;

import java.nio.charset.StandardCharsets;

public class IndexOfTester {
    public static void main(String[] args) {
        String text = "dkrndkdklskfncxbabcvlaforoekladaskvapq";
        String pattern = "abc";
        int idx = text.indexOf(pattern);


        String result;
        String pattern2="";
        String pattern3="";
        for (int i = 0; i < idx; i++) {
            pattern2+=" ";
        }
        int idx2 = text.length() - idx - pattern.length();
        for (int i = 0; i < idx2; i++) {
            pattern3+=" ";
        }
        result=pattern2+pattern+pattern3;
        System.out.printf("[%s]",result);
    }

}
