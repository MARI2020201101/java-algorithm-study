package ch03;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class BinarySearch {

    static int search(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;

        do{
            int mid = (start + end) /2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start=mid+1;
            }
            else if(arr[mid] > key){
                end = mid -1;
            }
        }while(start<=end);
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new Random().ints(10, 0, 10).toArray();
        int[] sortedArr = Arrays.stream(array).sorted().toArray();
        System.out.println("array : " + Arrays.toString(array));
        System.out.println("sortedArr : " + Arrays.toString(sortedArr));
        int result = search(sortedArr, 1);
        System.out.println("result  : " + result);


    }
}
