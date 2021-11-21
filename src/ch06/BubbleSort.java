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
        for (int i = 0; i < a.length; i++) { // 이부분. a.length -1 이어도 OK 왜냐면 어짜피 마지막 원소는
            //비교할 필요가 없기 때문
            for (int j = a.length-1; j > i; j--) {
                if(a[j] < a[j-1]){
                    swap(a , j,j-1);
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
