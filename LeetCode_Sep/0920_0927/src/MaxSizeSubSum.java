//0923
//0924
//325 Maximum Size Subarray Sum
//HashMap / map ......

import java.util.HashMap;

public class MaxSizeSubSum {
    public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0, result = 0;
        HashMap<Integer, Integer> m = new HashMap<>();

        for(int end = 0; end < nums.length; end++) {
            sum += nums[end];
            if (sum == k) result = end + 1;
            if(m.containsKey(sum - k)) result = Math.max(result, end - m.get(sum - k));
            if(!m.containsKey(sum)) m.put(sum, end);
        }
        return result;
    }

    public static void main(String[] args) {
        MaxSizeSubSum m = new MaxSizeSubSum();
        int[] eg = {1,-1,5,-2,3};
        System.out.println(m.maxSubArrayLen(eg, 3));
    }
}
