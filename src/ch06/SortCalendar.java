package ch06;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SortCalendar {
    public static void main(String[] args) {
        GregorianCalendar[] calendars = {
                new GregorianCalendar(1997,0,10),
                new GregorianCalendar(2020,4,11),
                new GregorianCalendar(1659,10,12)
        };
        Arrays.sort(calendars);

        for (int i = 0; i < calendars.length; i++) {
            int y = calendars[i].get(Calendar.YEAR);
            int m = calendars[i].get(Calendar.MONTH);
            int d = calendars[i].get(Calendar.DAY_OF_MONTH);
            System.out.printf("[YEAR] %d. [MONTH] %d. [DAY] %d \n", y,m+1,d);
        }

    }
}
