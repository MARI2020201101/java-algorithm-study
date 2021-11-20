package ch04;

import java.util.Arrays;

public class IntQueue {

    private int max;
    private int num;
    private int front;
    private int rear;

    private int[] queue;


    public class EmptyQueueException extends RuntimeException{

        @Override
        public String getMessage() {
            return "큐가 비어있습니다";
        }
    }
    public class OverFlowQueueException extends RuntimeException{
        @Override
        public String getMessage() {
            return "큐가 가득 찼습니다";
        }
    }

    public int enqueue(int data){
        if(num>=max){
            throw new OverFlowQueueException();
        }
        queue[rear++]=data;
        num++;
        if(rear == max){
            rear=0;
        }
        return data;
    }
    public int deque(){
        if(num<=0){
            throw new EmptyQueueException();
        }
        int data = queue[front++];
        num--;
        if(front == max){
            front = 0;
        }
        return data;
    }

    public int peek(){
        if(num==0){
            throw new EmptyQueueException();
        }
        return queue[front];
    }

    public int indexOf(int data){
        for (int i = 0; i < num; i++) {
             if(data == queue[(front + i)%max]){
                 return (front+i)%max;
             }
        }
        return -1;
    }

    public void clear(){
        num = front = rear =0;
    }
    public int capacity(){
        return max;
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){
        return num==0?true:false;
    }
    public boolean isFull(){
        return num==max? true:false;
    }
    public void dump(){
        if(num<=0){
            System.out.println("큐가 비어있습니다.");
        }
        int idx;
        for (int i = 0; i < num; i++) {
            idx=(front+i)%max;
            System.out.print(queue[idx]+ " , ");
        }
        System.out.println();
    }

    public String toString(){
        return Arrays.toString(queue);
    }

    public static void main(String[] args) {
        IntQueue intQueue = new IntQueue(10);
        intQueue.enqueue(3);
        intQueue.enqueue(4);
        intQueue.enqueue(5);
        intQueue.enqueue(6);
        intQueue.enqueue(7);
        intQueue.dump();
        System.out.println(intQueue.toString());
        intQueue.deque();
        intQueue.dump();
        System.out.println(intQueue.toString());//웃긴다!! 사실은 그냥 덮어씌울뿐이라는거!! 멋진데~
        intQueue.deque();
        intQueue.dump();
        System.out.println(intQueue.toString());
        intQueue.enqueue(5);
        intQueue.enqueue(6);
        intQueue.enqueue(7);
        intQueue.dump();
        System.out.println(intQueue.toString());
    }

    public IntQueue(int capacity){
        max=capacity;
        front=0;
        rear=0;
        num=0;
        try{
            queue=new int[capacity];
        } catch (OutOfMemoryError e) {
            max=0;
        }
    }
}
