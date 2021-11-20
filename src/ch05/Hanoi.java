package ch05;

public class Hanoi {
    static void move(int num, int x, int y){
        if(num<1) return;
        move(num-1, x, 6-x-y);
        System.out.printf("%d 번째 원반을 :  move %d 기둥 ==> %d 기둥",num, x,y);
        System.out.println();
        move(num-1,6-x-y, y);
    }

    public static void main(String[] args) {
        move(3,1,3);
    }
}
