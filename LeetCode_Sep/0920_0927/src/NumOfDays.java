//0920 1360 Number fo Days Between Two Dates

public class NumOfDays {
    public int daysBetweenDates(String date1, String date2) {
        int d1 = Integer.parseInt(date1);
        int d2 = Integer.parseInt(date2);
        return 0;
    }

    public static void main(String[] args) {
        NumOfDays nd = new NumOfDays();
        String date1 = "2019-06-29", date2 = "2019-06-30";
        nd.daysBetweenDates(date1, date2);
    }
}
