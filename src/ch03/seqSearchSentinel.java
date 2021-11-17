package ch03;

import java.util.Arrays;
import java.util.Random;

public class seqSearchSentinel {

    static int seqSearch(int[] arr, int n, int key){
        arr[n] = key;

        int i = 0;
        while(true){
            if(arr[i]==key) break;
            i++;
        }
        return i==n ? -1 : i;
    }


    public static void main(String[] args) {
        int[] array = new Random().ints(10, 1, 10).toArray();
        System.out.println(Arrays.toString(array));
        int result = seqSearch(array, 9, 1);
        System.out.println("result " + result);
    }
}
