package exercise3;

import java.util.ArrayList;
import java.util.List;

public class HowSum {

    public static void main(String[] args) {
        int[] arr = {3,1,4,5,7};
        System.out.println(howSum(7, arr));
    }

    public static List<Integer> howSum(int sum, int[] arr){
        if(sum<0){
            return null;
        }
        else if(sum==0){
            return new ArrayList<>();
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                List<Integer> list = howSum(sum - arr[i], arr);
//                System.out.println(list);
                if(list!=null){
                    list.add(arr[i]);
                    return list;
                }
            }
        }
        return null;
    }
}
