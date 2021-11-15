package ch02;

public class PrimeNumber3 {

    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;
        for(int i =5; i<=1000; i+=2){
            int j;
            for (j = 1; prime[j] * prime[j] <= i ; j++){
                counter+=2;
                if(i%prime[j]==0) break;
            }if(prime[j] * prime[j] > i){
                counter++;
                prime[ptr++] = i;
            }
        }
        for (int i = 0; i < ptr; i++) {
            System.out.println("prime : " +prime[i]);
        }
        System.out.println("counter : " + counter); //연산횟수 출력
    }
}
