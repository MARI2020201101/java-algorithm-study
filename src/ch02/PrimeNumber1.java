package ch02;

public class PrimeNumber1 {

    public static void main(String[] args) {
        int counter = 0;
        int total =0;
        for(int n =2; n<=1000;n++){
            for(int i=2;i<n;i++){
                counter++;
                if(n%i==0) break;
                else if(i==n-1) total++;
            }
        }
        System.out.println("counter :" + counter);
        System.out.println("total :" + total);
    }
}
