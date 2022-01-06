//0102
//1010. Pairs of Songs With Total Durations Divisible by 60

import java.util.Arrays;
import java.util.HashMap;

public class PairOfSongs {
    public int numPairsDivisibleBy60(int[] time) {

//        int count = 0;
//        int[] timeMod = new int[60];
//
//        for (int t : time) {
//            if (t % 60 == 0) count += timeMod[0];
//            else count += timeMod[60 - t % 60];
//            timeMod[t % 60]++;
//        }

        int count = 0;
        int[] table = new int[60];

        for (int i = 0; i < time.length; i++) table[time[i] % 60] += 1;
        //time = [30,20,150,100,40] -> [30,20,30,40,40]
        // -> [30 * 2,20 * 1,40 * 2]

        if (table[0] != 0) count += table[0] * (table[0] - 1) / 2;
        if (table[30] != 0) count += table[30] * (table[30] - 1) / 2;

        for (int i = 1; i < 30; i++) {
            if (table[i] != 0) {
                if (table[60 - i] != 0) {
                    count += table[i] * table[60 - i];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] time = {269,230,318,468,171,158,350,60,287,27,11,384,332,267,412,478,280,303,242,378,129,131,164,467,345,146,264,332,276,479,284,433,117,197,430,203,100,280,145,287,91,157,5,475,288,146,370,199,81,428,278,2,400,23,470,242,411,470,330,144,189,204,62,318,475,24,457,83,204,322,250,478,186,467,350,171,119,245,399,112,252,201,324,317,293,44,295,14,379,382,137,280,265,78,38,323,347,499,238,110,18,224,473,289,198,106,256,279,275,349,210,498,201,175,472,461,116,144,9,221,473};
        int[] time2 = {30,20,150,100,40};
        PairOfSongs pos = new PairOfSongs();
        System.out.println(pos.numPairsDivisibleBy60(time));
        System.out.println(pos.numPairsDivisibleBy60(time2));
    }
}
