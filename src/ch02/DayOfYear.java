package ch02;

public class DayOfYear {

    private static int[][] mdays = {
        {31,28,31,30,31,30,31,31,30,31,30,31},
        {31,29,31,30,31,30,31,31,30,31,30,31}
    };

    private static int isLeapYear(int year){
        return (year % 4 ==0 && year % 100!=0 || year%400==0)?1:0;
    }

    static int dayOfYear(int year, int month , int day){
        int totalDays=0;
        for(int i = 0; i<month -1 ; i++){
            totalDays+=mdays[isLeapYear(year)][i];
        }
        return totalDays+=day;
    }

    public static void main(String[] args) {
        int day = dayOfYear(2019, 3, 15);
        System.out.println("day : " + day);
    }
}
