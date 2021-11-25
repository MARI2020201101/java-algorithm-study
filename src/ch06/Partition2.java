package ch06;

import java.util.Arrays;
import java.util.Random;

public class Partition2 {

    static void swap(int[] a, int idx1 , int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    static void partition(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int pivot = arr[arr.length/2];

        do{
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;
            if(left<right){
                swap(arr, left, right);
            }
        }while(left<right);

        System.out.print("[left num] : ");
        for (int i = 0; i < left; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
        System.out.println("[pivot num] : " + pivot);
        System.out.print("[right num] : ");
        for (int i = right +1 ; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }
}
