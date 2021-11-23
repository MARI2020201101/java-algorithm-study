package ch06;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {


    static void sort(int[] arr){
        for (int h = arr.length/2; h >0 ; h/=2) {
            for (int i = h; i < arr.length; i++) {
                int j;
                int tmp = arr[i];
                for (j = i-h; j >= 0 && arr[j] > tmp; j-=h) {
                    arr[j+h] = arr[j];
                    arr[j] = tmp;
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
