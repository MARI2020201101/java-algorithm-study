package ch06;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {


    static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j >= 0 ; j--) {
                if(a[j]>a[i]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
    }

    static void sort2(int[] a, int n){
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];//삽입할 대상 선택
            for (j=i; j>0 && a[j-1] > tmp ; j--) { //종료조건: 0에 도달하거나. 대상이 더 크거나.
                a[j] = a[j-1]; // 알맞은 위치로 자리를 바꾼다.
            }
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        sort2(arr , arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
