//0119
//560. Subarray Sum Equals K

//could contain same numbers, not necessarily sorted
//1 <= nums.length <= 2 * 104

//continuous subarrays

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SubarrayK {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;

        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        for (int num : nums) {
            sum += num;
            if (preSum.containsKey(sum - k)) count += preSum.get(sum - k);
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

//    public int subarraySum(int[] nums, int k) {
//        int count = 0;
//
//        int[] sums = new int[nums.length + 1];
//        for (int i = 1; i < sums.length; i++) sums[i] = sums[i - 1] + nums[i - 1];
//
//        for (int start = 0; start < sums.length - 1; start++) {
//            for (int end = start + 1; end < sums.length; end++) {
//                if (sums[end] - sums[start] == k) count++;
//            }
//        }
//        return count;
//    }

    //523 Continuous Subarray Sum
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) sum %= k;
            if (preSum.containsKey(sum)) {
                if (i - preSum.get(sum) > 1) return true; //at least 2 elements
            }
            else preSum.put(sum, i);
        }
        return false;
    }

    //974. Subarray Sums Divisible by K
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0, curSum = 0;

        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            curSum %= k; // k>= 2, could not be 0
            if (curSum < 0) curSum += k;
            if (preSum.containsKey(curSum)) { //key: sum, val: freq
                count += preSum.get(curSum);
            }
            preSum.put(curSum, preSum.getOrDefault(curSum, 0) + 1);
        }
        return count;
    }

    //713. Subarray Product Less Than K
    //contiguous subarrays, no sorting
    // 1 <= nums[i] <= 1000
    // 0 <= k <= 106
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0 || k == 1) return 0; //strictly less than k

        int count = 0, curP = 1;

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            curP *= nums[right];
            while (curP >= k) {
                curP /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }


    public static void main(String[] args) {
        SubarrayK sk = new SubarrayK();
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
//        System.out.println(sk.subarraySum(nums, k));
        System.out.println(sk.subarraysDivByK(nums, k));
    }
}
