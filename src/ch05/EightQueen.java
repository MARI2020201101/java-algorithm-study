package ch05;

import java.util.Arrays;

public class EightQueen {

    static int[] pos = new int[8];
    static boolean[] flagA = new boolean[8];
    static boolean[] flagB = new boolean[8];
    static boolean[] flagC = new boolean[8];

    static void set(int i){
        for (int j = 0; j < 8; j++) {
            if(flagA[j]==false && flagB[i-j+7]==false && flagC[i+j]==false){
                pos[i] = j;
                if(i==7){
                    System.out.println(Arrays.toString(pos));
                }else{
                    flagA[j]=true;
                    flagB[i-j+7]=true;
                    flagC[i+j]=true;
                    set(i + 1);
                    flagA[j]=false;
                    flagB[i-j+7]=false;
                    flagC[i+j]=false;
                }
            }
        }
    }
    // i열의 알맞은 위치에 퀸을 배치
    static void set2(int i) {
        for (int j = 0; j < 8; j++) {
            if (flagA[j] == false &&			  	// 가로(j행)에 아직 배치하지 않았습니다.
                    flagB[i + j] == false &&		  	// 대각선 ／에 아직 배치하지 않았습니다.
                    flagC[i - j + 7] == false) {  	// 대각선 ＼에 아직 배치하지 않았습니다.
                pos[i] = j;							// 퀸을 j행에 배치합니다.
                if (i == 7)							// 모든 열에 배치한다면
                    System.out.println(Arrays.toString(pos));
                else {
                    flagA[j] = flagB[i + j] = flagC[i - j + 7] = true;
                    set2(i + 1);
                    flagA[j] = flagB[i + j] = flagC[i - j + 7] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        set2(0); //뭐여 이거.??
    }
}
