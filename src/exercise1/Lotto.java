package exercise1;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] answer = solution.solution(new int[]{45, 4, 35, 20, 3, 9},new int[]{20, 9, 3, 45, 4, 35});
        System.out.println(Arrays.toString(answer));
    }
}
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt =0;
        int zero = 0;
        int[] rank ={6,6,5,4,3,2,1};
        //	[44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19]

        for(int i=0;i< lottos.length;i++){
            if(lottos[i]==0) zero++;
            for(int j=0;j< win_nums.length;j++){
                if(lottos[i]==win_nums[j]){
                    cnt++;
                }
            }
        }
        answer[1]=rank[cnt];
        answer[0]=rank[cnt+zero];
        return answer;
    }
}