package ch06;

import java.util.Arrays;
import java.util.Random;

public class Partition {

    static void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    static void partition(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int pivot = arr[arr.length/2];

        do{
            while(arr[left]<pivot) left++;
            while(arr[right]>pivot) right--;
            if(left<=right){
                swap(arr, left++, right--);
            }
        }while(left<=right);

    }
    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }
}
