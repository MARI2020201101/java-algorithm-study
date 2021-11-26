package ch06;

import java.util.Arrays;
import java.util.Random;

public class MergeArray {

    static void merge(int[] a, int[] b, int[] c){
        int pa =0;
        int pb =0;
        int pc =0;

        while(pa<a.length && pb<b.length){
            c[pc++] = a[pa] < b[pb] ? a[pa++] : b[pb++];
        }
        while(pa<a.length){
            c[pc++] = a[pa++];
        }
        while(pb<b.length){
            c[pc++] = b[pb++];
        }

    }

    public static void main(String[] args) {
        int[] array1 = Arrays.stream(new Random().ints(10, 0, 100).toArray()).sorted().toArray();
        int[] array2 = Arrays.stream(new Random().ints(10, 0, 100).toArray()).sorted().toArray();
        int[] array3 = new int[20];
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        merge(array1,array2,array3);
        System.out.println(Arrays.toString(array3));

    }
}
