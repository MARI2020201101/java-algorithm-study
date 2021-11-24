package ch06;

import java.util.Arrays;
import java.util.Random;

public class ShellSort2 {

    static void sort(int[] arr){
        int h;
        for(h=1;h<arr.length/9; h= h*3+1);

        for(;h>0;h/=3){
            for (int i = h; i < arr.length; i++) {
                int tmp = arr[i];
                for (int j = i-h; j >=0 && arr[j] > tmp; j--) {
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
