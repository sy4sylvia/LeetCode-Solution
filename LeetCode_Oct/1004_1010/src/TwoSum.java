//10/06
//1 Two Sum
//using HashMap

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 1};
        if (nums.length != 2) {
            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int tmp = target - nums[i];
                if (mp.containsKey(tmp)) {
                    result[0] = mp.get(tmp);
                    result[1] = i;
                }
                mp.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] numArr = {3, 5, 1, 2};

        int[] res = ts.twoSum(numArr, 4);
        for (int i = 0; i < 2; i++) System.out.println(res[i]);
    }
}
