package ch02;

public class CardConvRev {

    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            char c = dchar.charAt(x % r);
            d[digits++]=c;
            x/=r;
        }while(x!=0);
        return digits;
    }

    public static void main(String[] args) {
        int num = 4;
        char[] chars = new char[10];
        cardConvR(4,2, chars);
        System.out.println(chars);

        //거꾸로 저장된다는게 흠이군
    }
}
