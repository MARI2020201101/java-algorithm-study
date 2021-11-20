package ch05;

public class QueenB {

    static int[] pos = new int[8];

    static void print(){
        for (int i = 0; i < pos.length; i++) {
            System.out.printf("%2d " , pos[i]);
        }
            System.out.println();
    }


    static void set(int i){
        for (int j = 0; j < pos.length; j++) {
            pos[i] = j;
            if(i==7) print();
            else set(i++);
        }
    }


    public static void main(String[] args) {
        set(0);
    }
}
