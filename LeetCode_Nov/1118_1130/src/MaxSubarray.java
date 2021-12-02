//1120
//53 Maximum Subarray
public class MaxSubarray {

//    public int maxSubArray(int[] nums) {
//        int[] dp = new int[nums.length + 1];
//        dp[0] = nums[0];
//        int max = nums[0];
//        if (nums.length == 1) return nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (dp[i - 1] <= 0) dp[i] = nums[i];
//            else dp[i] = dp[i - 1] + nums[i];
//            max = Math.max(max, dp[i]);
//        }
//        return max;
//    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) nums[i] += nums[i - 1];
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSubarray ms = new MaxSubarray();
        int[] n = {5,4,-1,7,8};
        System.out.println(ms.maxSubArray(n));
    }
}
