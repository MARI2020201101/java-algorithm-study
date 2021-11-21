package ch06;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    static void swap(int[] a, int idx1 , int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1 ; j < a.length; j++) {
                if(a[j] < a[min]){
                    swap(a, j, min);
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
