package ch06;

import java.util.Arrays;
import java.util.Random;

public class FSort {

    static void fSort(int[] a, int max){
        //도수 분포표를 만든다.
        int[] f = new int[max+1];
        for (int i = 0; i < a.length; i++) {
            f[a[i]]++;
        }

        //누적 도수 분포표를 만든다.
        for (int i = 0; i < f.length-1; i++) {
            f[i+1] += f[i];
        }

        //arr의 값을 찾아서. 목적배열에 저장한다.
        int[] b = new int[a.length];
        for (int i = a.length-1; i >=0 ; i--) {
            b[--f[a[i]]] = a[i];
        }

        //배열 복사
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        fSort(arr, max);
        System.out.println(Arrays.toString(arr));
    }
}
