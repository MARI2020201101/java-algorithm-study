package ch04;

import java.util.Arrays;

public class IntStack {
    private int[] stack;
    private int max;
    private int ptr;


    public class EmptyStackException extends RuntimeException{

        @Override
        public String getMessage() {
            return "스택이 비어있습니다";
        }
    }
    public class OverFlowStackException extends RuntimeException{
        @Override
        public String getMessage() {
            return "스택이 가득 찼습니다";
        }
    }

    public int push(int data) throws OverFlowStackException{
        if(ptr>max){
            throw new OverFlowStackException();
        }
        stack[ptr++] = data;
        return data;
    }

    public int pop() throws EmptyStackException{
        if(ptr<=0){
            throw new EmptyStackException();
        }
        int data = stack[--ptr];
        return data;
    }

    public int peek() throws EmptyStackException{
        if(ptr<=0){
            throw new EmptyStackException();
        }
        return stack[ptr - 1];
    }

    public int indexOf(int target){
        for (int i = ptr-1; i >= 0; i--) {
            if(target==stack[i])
                return i;
        }return -1;
    }

    @Override
    public String toString(){
        return Arrays.toString(stack);
    }

    public static void main(String[] args) {
        IntStack intStack = new IntStack(10);
        int push = intStack.push(10);
        int push2 = intStack.push(2);
        int push3 = intStack.push(3);
        int push4 = intStack.push(4);
        int push5 = intStack.push(5);

        System.out.println(intStack.toString());
        int index = intStack.indexOf(3);
        System.out.println("index : "+index);

        boolean isFull = intStack.isFull();
        System.out.println("isFull : " + isFull);

        int peek = intStack.peek();
        System.out.println("peek : " + peek);
        System.out.println(intStack.toString());

        int pop = intStack.pop();
        System.out.println("pop : "+ pop);
        System.out.println(intStack.toString()); //아!! 데이터를 초기화 하는게 아니라. 그냥 주고 속이는(?)
        //이런식으로 구현할수도 있군~~~

        int peek2 = intStack.peek();
        System.out.println("peek2 : " + peek2);
        System.out.println(intStack.toString());


    }

    public void clear(){
        ptr = 0;
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return ptr;
    }

    public boolean isEmpty(){
        return ptr==0? true : false;
    }

    public boolean isFull(){
        return ptr==max? true : false;
    }

    public IntStack(int capacity){
        try{
            stack = new int[capacity];
            max= capacity;
            ptr=0;
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

}
