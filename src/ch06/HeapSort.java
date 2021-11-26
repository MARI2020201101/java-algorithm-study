package ch06;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {

    static void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    static void downHeap(int[] arr, int left, int right){
        int tmp = arr[left]; //부모 노드.
        int parent;
        int child;

        //힙으로 만드는 연산을 수행한다
        for (parent = left;  parent<(right+1)/2 ; parent=child) {
            //우선 두개 child 노드 중에서 더 큰쪽 인덱스를 선택한다.
            int cl = parent*2+1;
            int cr = parent*2+2;
            //cr 노드가 없을 수 있다...
            child = (cr<=right && arr[cr]>arr[cl]) ? cr : cl;
            // 부모 노드와 차일드 노드를 비교해서 만약에 차일드노드가 더 클경우 자리를 바꾼다.
            if(tmp >= arr[child]) break;
            arr[parent] = arr[child];
        }
        //값을 바꿔준다.
        arr[parent] = tmp;
    }

    static void heapSort(int[] arr, int n){
        //배열의 뒤쪽에있는 부모노드부터 차례대로 힙으로 만든다.
        //right 는 배열의 끝
        for (int i = (n-1)/2; i >=0 ; i--) {// arr[i]~arr[n-1]을 힙으로 만든다.
            downHeap(arr, i , n-1);
        }

        for (int i = n-1; i > 0 ; i--) {
            swap(arr,0, i );
            downHeap(arr, 0, i-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(arr));
        heapSort(arr , arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
