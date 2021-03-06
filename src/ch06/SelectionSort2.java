package ch06;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort2 {

    static void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int k = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(min > arr[j]){
                    swap(arr, k, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
