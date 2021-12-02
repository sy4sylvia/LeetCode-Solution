//1121
//213. House Robber II

public class HouseRobber2 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(helperRob(nums, 0, nums.length - 1), helperRob(nums, 1, nums.length));
    }

    private int helperRob(int[] nums, int startIndex, int endIndex) {
        int[][] dp = new int[endIndex - startIndex][2];
        dp[0][0] = nums[startIndex];
        if (startIndex == 0) {
            for (int i = 1; i < dp.length; i++) {
                dp[i][0] = dp[i - 1][1] + nums[i];
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            }
        }
        else {
            for (int i = 1; i < dp.length; i++) {
                dp[i][0] = dp[i - 1][1] + nums[i + 1];
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            }
        }
        return Math.max(dp[dp.length - 1][0], dp[dp.length - 1][1]);
    }

    public static void main(String[] args) {
        HouseRobber2 hr2 = new HouseRobber2();
        int[] n = {1,2, 3, 1};
        System.out.println(hr2.rob(n));
    }
}
