package ch06;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    static void swap(int[] a, int idx1 , int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void sort(int[] a){
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length-1; j > i; j--) {
                counter++;
                if(a[j] < a[j-1]){
                    swap(a , j,j-1);
                }
            }
        }
        System.out.println("비교횟수  : " + counter);
    }

    static void sort2(int[] a){
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isExchanged = false;
            for (int j = a.length-1; j > i; j--) {
                counter++;
                if(a[j] < a[j-1]){
                    swap(a , j,j-1);
                    isExchanged = true;
                }
                if(! isExchanged) break;
            }

        }
        System.out.println("비교횟수 : " + counter);
    }

    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        long start = System.nanoTime();
        sort(arr);
        long end = System.nanoTime();
        System.out.println(Arrays.toString(arr));
        System.out.println("수행시간 : " + (end-start) + " ns");

        System.out.println("--------------------------------");
        int[] arr2 = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr2));
        long start2 = System.nanoTime();
        sort2(arr2);
        long end2 = System.nanoTime();
        System.out.println(Arrays.toString(arr2));
        System.out.println("수행시간 : " + (end2-start2) + " ns");
    }

}
