package ch05;

import ch04.IntStack;

public class Recursion {

    static int recursion(int n){
        if(n<=0) return -1;
        recursion(n-1); //왼쪽 노드
        System.out.println(n);// root 노드
        recursion(n-1); //오른쪽 노드
        //하나의 작업이 전부 완료되어야 이전 호출한 노드로 돌아갈 수 있다
        return -1;
    }

    static void recursion2(int n){
        while(n>0){
            recursion2(n-1);
            System.out.println(n);
            n--;
        }
    }
    static void recursion3(int n){
       if(n<=0) return;
       recursion3(n-1);
       System.out.println(n);//전위순회
    }
    static void recursion4(int n){
        if(n<=0) return;
        System.out.println(n); //후위순회
        recursion4(n-1);
    }

    static void recursion5(int n){
        IntStack intStack = new IntStack(100);
        while(n>0){
            intStack.push(n);
            n--;
        }
        while(! intStack.isEmpty()){
            System.out.println(intStack.pop());
        }
    }

    static void recursion6(int n){
        IntStack intStack = new IntStack(100);
        while(n>0){
            intStack.push(n);
            n--;
            if(! intStack.isEmpty()){
                System.out.println(intStack.pop());
            }
        }
    }
    public static void main(String[] args) {
        recursion6(4);
    }


}
