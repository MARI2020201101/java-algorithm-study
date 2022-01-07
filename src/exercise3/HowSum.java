package exercise3;

import java.util.ArrayList;
import java.util.List;

public class HowSum {
<<<<<<< HEAD
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,7};
        String result = "";
        System.out.println(howSum(arr, 7, 0, result));


    }
    public static String howSum(int[] arr, int sum, int n , String result){
        if(sum==0){
            return result;
        }
        else if(sum<0){
            return "";
        }
        else{
            for (int i = n; i < arr.length; i++) {
                result += arr[i] + " , ";
                String s1 = howSum(arr, sum - arr[i], n++, result);
                if(s1!="") return s1;
                result = "";
                String s2 = howSum(arr, sum, n++, result);
                if(s2!="") return s2;
            }
            return result;
        }
    }
}

=======

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
>>>>>>> 402ffc12080a3716e8a862b5aeaee4ebf654d95b
