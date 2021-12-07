package exercise3;

import java.util.ArrayList;
import java.util.List;

public class BestSum {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,7};
        List<Integer> result = bestSum(7, arr);
        System.out.println(result);
    }

    public static List<Integer> bestSum(int sum, int[] arr){
        List<Integer> bestSum = new ArrayList<>();
        if(sum==0){
            return new ArrayList<>();
        }else if(sum<0){
            return null;
        }else{
            for (int i = 0; i < arr.length; i++) {
                List<Integer> result = bestSum(sum - arr[i], arr);
                if(result!=null){
                    result.add(arr[i]);
                    if(bestSum.isEmpty() || result.size() < bestSum.size()){
                        bestSum = result;
                    }
                }
            }

            return bestSum;
        }


    }
}
