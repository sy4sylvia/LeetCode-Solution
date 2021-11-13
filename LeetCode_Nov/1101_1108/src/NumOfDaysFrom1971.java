public class NumOfDaysFrom1971 {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(countSince1971(date1) - countSince1971(date2));
    }

    private int countSince1971(String date) {
        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dateInNum = date.split("-");
        int year = Integer.parseInt(dateInNum[0]);
        int month = Integer.parseInt(dateInNum[1]);
        int day = Integer.parseInt(dateInNum[2]);

        for (int i = 1971; i < year; i++) {
            day += isLeapYear(i) ? 366 : 365;
        }

        for (int i = 1; i < month; i++) {
            if (isLeapYear(year) && i == 2) day += 1;
            day += monthDays[i];
        }
        return day;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void main(String[] args) {
        NumOfDaysFrom1971 n1971 = new NumOfDaysFrom1971();
        String date1 = "1971-06-29", date2 = "2010-09-23";
        System.out.println(n1971.daysBetweenDates(date1, date2));
    }
}
