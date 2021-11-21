package ch05;

import ch04.IntStack;

public class Recursion2 {

    static void recur(int n){

        //while, for 문 같은 반복문을 사용할 경우. bottom up 방식으로 -> 아래에서 위로 올라가는 방식
        // 무조건 후위 순회 구조를 띄게 된다
        //이것대신 stack사용해서. 실행하고자 하는 구문을 저장하는 방식을 사용하는 것이다
        IntStack intStack = new IntStack(100);
            while(n>0){
                intStack.push(n);
                n--;
            }
            while(! intStack.isEmpty()){
                System.out.println(intStack.pop());
            }
    }


    static void recur2(int n){
        while(n>0){
            System.out.println(n);
            n--;
        }
    }

    static void recur3(int n){
        IntStack intStack = new IntStack(100);
        while(true){

            if(n>0){
                intStack.push(n);
                n--;
                continue;
            }
            if(! intStack.isEmpty()){
                int num = intStack.pop();
                System.out.println(num);
                n=num-1;
                continue; //while 문으로 돌아간다
            }

            break;
        }
    }

    public static void main(String[] args) {
        recur(4);
        System.out.println("-----------");
        recur2(4);
        System.out.println("-----------");
        recur3(4);
    }
}
