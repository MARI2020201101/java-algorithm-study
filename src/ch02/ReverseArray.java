package ch02;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ReverseArray {

    static void swap(int[] a ,int idx1, int idx2){
        int t = a[idx1];
        a[idx1] =a[idx2];
        a[idx2]= t;
    }

    static void reverse(int[] a){
        for(int i=0; i<a.length/2 ;i++){
            swap(a , i, a.length-i-1); //끝에 있는 애랑 앞에 있는 애랑 자리 바꾸기
        }
    }

    public static void main(String[] args) {
        int[] array = new Random()
                .ints(10, -100, 100).toArray();
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
