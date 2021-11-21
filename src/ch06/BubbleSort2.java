package ch06;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort2 {

    static void swap(int[] a, int idx1 , int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }


    static void sort(int[] a){
        int counter = 0;
        int k = a.length-1;
        while(k>0){
            int last = 0;
            for (int j = a.length-1; j > 0 ; j--) {
                counter++;
                if(a[j] < a[j-1]){
                    swap(a, j, j-1);
                    last = j;
                }
                k=last;
            }

        }
        System.out.println("연산 횟수 : " + counter);
    }

    // 버블 정렬(버전 3)
    static void sort2(int[] a, int n) {
        int counter = 0;
        int k = 0;
        while (k < n - 1) {
            int last = n - 1;
            for (int j = n - 1; j > k; j--){
                counter++;
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }
        System.out.println("연산 횟수 : " + counter);
    }
    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        sort2(arr,arr.length);
//        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
