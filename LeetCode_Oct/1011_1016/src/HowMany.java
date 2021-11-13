//1365. How Many Numbers Are Smaller Than the Current Number
//1017

import java.util.Arrays;
import java.util.HashMap;

public class HowMany {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] table = new int[101];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            table[nums[i]]++;
        }
        for (int j = 1; j < 101; j++) {
            table[j] += table[j - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) res[i] = 0;
            else
                res[i] = table[nums[i] - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        HowMany h = new HowMany();
        int[] number = {0, 6, 5, 4, 8};
        int[] res = h.smallerNumbersThanCurrent(number);
        for (int i = 0; i < res.length ; i++) System.out.print(res[i] + " ");
        System.out.println();
        for (int i : res) System.out.print(i + " ");
        System.out.println();
        System.out.println();

        for (int i = 0; i < number.length ; i++) System.out.print(number[i] + " ");
        System.out.println();
        for (int n : number) System.out.print(n + " ");
    }
}
