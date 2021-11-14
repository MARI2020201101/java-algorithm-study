package ch02;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayEqual {

    static boolean equals(int[] a, int[] b){
        if(a.length!=b.length){
            return false;
        }else{
            for (int i = 0; i < a.length; i++) {
                if(a[i]!=b[i])
                    return false;
            }
        } return true;
    }

    public static void main(String[] args) {
        int[] arr1 = new Random().ints(10, -100, 100).toArray();
        int[] arr2 = new Random().ints(10, -100, 100).toArray();

        int[] array1 = Arrays.stream(arr1).sorted().toArray();
        int[] array2 = Arrays.stream(arr2).sorted().toArray();

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        boolean equals = equals(array1, array2);
        System.out.println("equals: " +equals);


        int[] arr3 = {2,3,4,5,6,7,8};
        int[] arr4 = {2,3,4,5,6,7,8};
        boolean equals2 = equals(arr3, arr4);
        System.out.println("equals2: "+ equals2);
    }
}
