package ch05;

import ch04.IntStack;

public class Recur {

    public static int COUNTER =0 ;
    public void recur(int n){
        if(n<=0) return; //basecase 를 생각한다 - 언제 호출을 멈출것인가?
        COUNTER++;
        recur(n-1);
        System.out.println(n);
        recur(n-2);
    }

    public void recur2(int n){
        while(n>0){
            recur(n-1);
            System.out.println(n);
            n = n-2;
        }
    }
    IntStack intStack = new IntStack(100);

    public void recur3(int n){
        while(true){

            if(n>0){
                intStack.push(n);
                n--;
                continue;
            }//일단 넣어두고

            if(! intStack.isEmpty()){ // 종료조건?
                n = intStack.pop();
                System.out.println(n); //종료조건
                n=n-2; // 한번 더 !
                continue;
            }
            break; //할일 없어지면 break

        }
    }
    public static void main(String[] args) {
        Recur recur = new Recur();
        recur.recur3(4);
    }
}
