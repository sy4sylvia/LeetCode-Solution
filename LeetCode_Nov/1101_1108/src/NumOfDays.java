//1110
//1360. Number of Days Between Two Dates

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumOfDays {

    //wrong answer
    public int daysBetweenDates(String date1, String date2) {
        String[] initial = {"1971", "01", "01"};

        String[] d1 = date1.split("-");
        String[] d2 = date2.split("-");

        int[] diff1 = new int[3];
        int[] diff2 = new int[3];

        for (int i = 0; i < 3; i++) {
            diff1[i] = Integer.parseInt(d1[i]) - Integer.parseInt(initial[i]);
            diff2[i] = Integer.parseInt(d2[i]) - Integer.parseInt(initial[i]);
        }
        int yearDiff1 = (diff1[0] / 4) * 366 + (diff1[0] - (diff1[0] / 4) ) * 365;
        int yearDiff2 = (diff2[0] / 4) * 366 + (diff2[0] - (diff2[0] / 4) ) * 365;
        int yearDiff = yearDiff1 - yearDiff2;


        int monthDiff1 = diff1[1];
        int monthDiff2 = diff2[1];
        int monthDiff1InDays = 0, monthDiff2InDays = 0;

//        if (monthDiff1 == 0) monthDiff1InDays = 0;
        monthDiff1InDays = getMonthDiff2InDays(monthDiff1, monthDiff1InDays);


//        if (monthDiff2 == 0) monthDiff2InDays = 0;
        monthDiff2InDays = getMonthDiff2InDays(monthDiff2, monthDiff2InDays);

        if ((Integer.parseInt(d1[0]) % 4 == 0 && Integer.parseInt(d1[0]) % 100 != 0) || Integer.parseInt(d1[0]) % 400 == 0 && Integer.parseInt(d1[1]) >= 2) monthDiff1InDays += 1;
        if ((Integer.parseInt(d2[0]) % 4 == 0 && Integer.parseInt(d2[0]) % 100 != 0) || Integer.parseInt(d2[0]) % 400 == 0 && Integer.parseInt(d2[1]) >= 2) monthDiff2InDays += 1;

//
//        switch (monthDiff1) {
//            case 1:
//                monthDiff1InDays = 31;
//                break;
//            case 2:
//                if (Integer.parseInt(d1[0]) % 4 != 0) monthDiff1InDays = 31 + 28;
//                else monthDiff1InDays = 31 + 29;
//                break;
//            case 3:
//                if (Integer.parseInt(d1[0]) % 4 != 0) monthDiff1InDays = 31 * 2 + 28;
//                else monthDiff1InDays = 31 * 2 + 29;
//                break;
//            case 4:
//                if (Integer.parseInt(d1[0]) % 4 != 0) monthDiff1InDays = 31 * 2 + 28 + 30;
//                else monthDiff1InDays = 31 * 2 + 29 + 30;
//                break;
//            case 5:
//                if (Integer.parseInt(d1[0]) % 4 != 0) monthDiff1InDays = 31 * 2 + 28 + 30;
//                else monthDiff1InDays = 31 * 2 + 29 + 30;
//                break;
//
//
//        }

        int monthDiff = monthDiff1InDays - monthDiff2InDays;
        int dayDiff = diff1[2] - diff2[2];

        return Math.abs(yearDiff + monthDiff + dayDiff);

//        return Math.abs((int) ChronoUnit.DAYS.between(LocalDate.parse(date1), LocalDate.parse(date2)));
    }

    private int getMonthDiff2InDays(int monthDiff2, int monthDiff2InDays) {
        if (monthDiff2 == 1) monthDiff2InDays = 31;
        if (monthDiff2 == 2) monthDiff2InDays = 31 + 28;
        if (monthDiff2 == 3) monthDiff2InDays = 31 * 2 + 28;
        if (monthDiff2 == 4) monthDiff2InDays = 31 * 2 + 28 + 30;
        if (monthDiff2 == 5) monthDiff2InDays = 31 * 3 + 28 + 30;
        if (monthDiff2 == 6) monthDiff2InDays = 31 * 3 + 28 + 30 * 2;
        if (monthDiff2 == 7) monthDiff2InDays = 31 * 4 + 28 + 30 * 2;
        if (monthDiff2 == 8) monthDiff2InDays = 31 * 5 + 28 + 30 * 2;
        if (monthDiff2 == 9) monthDiff2InDays = 31 * 5 + 28 + 30 * 3;
        if (monthDiff2 == 10) monthDiff2InDays = 31 * 6 + 28 + 30 * 3;
        if (monthDiff2 == 11) monthDiff2InDays = 31 * 6 + 28 + 30 * 4;
        return monthDiff2InDays;
    }

    public static void main(String[] args) {
        NumOfDays n = new NumOfDays();
        String date1 = "1971-06-29", date2 = "2010-09-23";
        System.out.println(n.daysBetweenDates(date1, date2));
    }
}
