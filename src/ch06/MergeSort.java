package ch06;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    static int[] buf;


    static void __mergeSort(int[] arr, int left, int right){
        // left 와 right를 계속 반으로 쪼갠다.
        if(left<right){
            int pl = left;
            int mid = (left+right)/2;
            int p = 0;
            int k = mid +1;
            int b = 0;

            __mergeSort(arr, left, mid);
            __mergeSort(arr, mid+1, right);

            //  병합한다.
            for (int i = left; i <= mid; i++) {
                buf[p++] = arr[i];
            }// 왼쪽으로 쪼갠 arr을 buffer 로 옮기고 -> 오른쪽 arr과 buffer를 비교하면서 병합

            while(b < p && k <= right){
                arr[pl++] = arr[k] < buf[b] ? arr[k++] : buf[b++];
            }

            while(b < p){
                arr[pl++] = buf[b++];
            }
            while(k <= right){
                arr[pl++] = arr[k++];
            }
        }
    }

    static void mergeSort(int[] arr, int n){
        buf = new int[n];
        __mergeSort(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
