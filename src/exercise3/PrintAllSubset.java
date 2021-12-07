package exercise3;

import java.util.HashSet;
import java.util.Set;

public class PrintAllSubset {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,7};
        printAllSubset(arr, 0, new HashSet<>());
    }
    //바뀌는 것을 생각한다....
    public static Set<Integer> printAllSubset(int[] arr,int n, Set<Integer> subset){
        if(n>arr.length){
            return subset;
        }

        Set<Integer> set = printAllSubset(arr, n++, subset);


        return subset;
    }

}
