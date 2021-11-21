package ch05;

import java.util.Arrays;

public class QueenBB {

    static int[] pos = new int[8];
    static boolean[] flag = new boolean[8];

    static void set(int i){ //열
        for (int j = 0; j < 8; j++) { //행
            if(flag[j] == false){
                pos[i] = j; // 첫번째 행에 두고.
                if(i==7){ //모든 열에 두었을때.
                    System.out.println(Arrays.toString(pos));
                }else{
                    flag[j] = true; //플래그 변수 업데이트 하고.
                    set(i + 1); // 그다음 열에 둔다.
                    flag[j] = false;
                }
            }
        }
    }
    // i열의 알맞은 위치에 퀸을 배치합니다.
    static void set2(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag[j] == false) {		// j행에는 퀸을 아직 배치하지 않았다면
                pos[i] = j;				// 퀸을 j행에 배치합니다.
                if (i == 7)				// 모든 열에 배치한 경우
                    System.out.println(Arrays.toString(pos));
                else {
                    flag[j] = true;
                    set2(i + 1);
                    flag[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        set(0);
    }
}
