package exercise2;

import java.util.Arrays;

public class NonExistNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }

}
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] check = new int[10];
        for(int i=0;i< check.length; i++){
            check[i]=i;
        }
        for(int i=0;i<numbers.length; i++){
            check[numbers[i]]=0;
        }
        for(int i =0; i<check.length;i++){
         answer+=check[i];
        }
        return answer;
    }
}