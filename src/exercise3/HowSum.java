package exercise3;

import java.util.ArrayList;
import java.util.List;

public class HowSum {
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

