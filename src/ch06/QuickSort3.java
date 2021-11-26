package ch06;

import ch04.IntStack;

import java.util.Arrays;
import java.util.Random;

public class QuickSort3 {
    static void swap(int[] a, int idx1 , int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void quickSort(int[] arr, int left, int right){
        IntStack leftStack = new IntStack(right-left+1);
        IntStack rightStack = new IntStack(right-left+1);

        leftStack.push(left);
        rightStack.push(right);

        while(! leftStack.isEmpty()){

            int pl = left = leftStack.pop();
            int pr = right = rightStack.pop();
            int pivot = arr[(pl+pr)/2];

            while(pl<pr){
                while(arr[pl]<pivot)pl++;
                while(arr[pr]>pivot)pr--;
                if(pl<pr) {
                    swap(arr, pl, pr);
                }
            }

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
            if(left<pl){
                leftStack.push(left);
                rightStack.push(pl);
            }
            if(pr<right){
                leftStack.push(pr+1);
                rightStack.push(right);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
