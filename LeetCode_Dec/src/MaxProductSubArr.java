//1202
//152. Maximum Product Subarray

//1 <= nums.length
//-10 <= nums[i] <= 10

public class MaxProductSubArr {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];
        int curMax = nums[0], curMin = nums[0];
        int ans = curMax;
//        int[][] dp = new int[nums.length + 1][2];
//        for (int m = 1; m < nums.length; m++) {
//            int cur = nums[m];
//            dp[m][0] = Math.max(cur, Math.max(cur * curMax, cur * curMin));
//            dp[m][1] = Math.min(cur, Math.min(cur * curMax, cur * curMin));
//            curMax = dp[m][0];
//            curMin = dp[m][1];
//            ans = Math.max(ans, curMax);
//        }
//        return ans;

        //dp[nums.length + 1][nums.length + 1]
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int tmpMax = Math.max(cur, Math.max(cur * curMax, cur * curMin));
            int tmpMin = Math.min(cur, Math.min(cur * curMax, cur * curMin));
            curMax = tmpMax;
            curMin = tmpMin;
            ans = Math.max(ans, curMax);
        }
        return ans;
    }

    public static void main(String[] args) {
        MaxProductSubArr mpsa = new MaxProductSubArr();
        int[] nums = {2, -3, 1, -4};
        System.out.println(mpsa.maxProduct(nums));
    }
}
