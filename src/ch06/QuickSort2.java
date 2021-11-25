package ch06;

import java.util.Arrays;
import java.util.Random;

public class QuickSort2 {
    static void swap(int[] a, int idx1 , int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void quickSort(int[] arr, int left, int right){

        int pl = left;
        int pr = right;
        int pivot = arr[(pl+pr)/2];

        System.out.printf("arr[%d] ~ arr[%d] : {",left,right );
        for (int i = left; i < right; i++) {
            System.out.printf("%d , ", arr[i] );
        }
        System.out.printf(" %d}\n ", arr[right]);



        do{
            while(arr[pl] < pivot) pl++;
            while(arr[pr] > pivot) pr--;
            if(pl < pr){
                swap(arr, pl, pr);
            }
        }while(pl<pr);

        if(left < pl) quickSort(arr, left, pl);
        if(pr < right) quickSort(arr, pr +1, right);
    }


    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
