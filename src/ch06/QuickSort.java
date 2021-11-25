package ch06;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    static void swap(int[] a, int idx1 , int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void quickSort(int[] arr, int left, int right){

        //재귀적으로 파티셔닝을 한다.
        int pl = left;
        int pr = right;
        int pivot = arr[(pl+pr)/2];
        do{
            while(arr[pl] < pivot) pl++;
            while(arr[pr] > pivot) pr--;
            if(pl < pr){
                swap(arr, pl, pr);
            }
        }while(pl<pr);

        System.out.print("[left num] : ");
        for (int i = 0; i < pl; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
        System.out.println("[pivot num] : " + pivot);
        System.out.print("[right num] : ");
        for (int i = pr +1 ; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------");
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
