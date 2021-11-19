package ch03;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchTester {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 0, 10).toArray();
        int[] sortedArr = Arrays.stream(array).sorted().toArray();
        System.out.println("array : " + Arrays.toString(array));
        System.out.println("sortedArr : " + Arrays.toString(sortedArr));
        int result = Arrays.binarySearch(array, 4);
        int result2 = Arrays.binarySearch(sortedArr, 4);

        //없는 경우 있어야할 인덱스의 -i-1 반환한다
        //정렬되어있지 않으면 못찾음 ;;
        System.out.println("result  : " + result);
        System.out.println("result2  : " + result2);

    }
}
