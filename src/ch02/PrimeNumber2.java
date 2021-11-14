package ch02;

public class PrimeNumber2 {

    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[0] =2;
        for(int i =3; i<=1000; i+=2){
            int j;
            for(j=0;j<ptr;j++){
                counter++;
                if(i % prime[j]==0) break;
            }
            if(j==ptr) {
                System.out.println(i);
                prime[++ptr]=i;
            }
        }
        System.out.println("counter : " +counter);
    }
}
