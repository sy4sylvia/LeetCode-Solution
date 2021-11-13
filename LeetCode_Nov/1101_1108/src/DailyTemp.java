//1113
//739 Daily Temperatures

public class DailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        //sliding window
        int start = 0;
        int count = 0;
        int highTemperature = 0;

        for (int currDay = temperatures.length - 1; currDay >= 0; currDay--) {
            if (temperatures[currDay] >= highTemperature) {
                highTemperature = temperatures[currDay];
                continue;
            }

            int days = 1;
            while (temperatures[currDay + days] <= temperatures[currDay]) {
                days += ans[currDay + days];
            }
            ans[currDay] = days;
        }

//        for (int end = 0; end < temperatures.length; end++) {
//            int diff = temperatures[end] - temperatures[start];
//            count++;
//
//            while (diff > 0 ) {
//                diff = temperatures[end] - temperatures[start];
//                ans[start] = count;
//                start++;
//            }
//
//

        return ans;
    }





    public static void main(String[] args) {
        DailyTemp dt = new DailyTemp();
        int[] t = {73,74,75,71,69,72,76,73};
        int[] a = dt.dailyTemperatures(t);
        for (int i : a) System.out.print(i + "  ");
    }
}
