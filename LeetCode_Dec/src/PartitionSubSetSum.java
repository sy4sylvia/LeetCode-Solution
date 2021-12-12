import java.util.Arrays;

//1211
// 416 Partition Equal SubSet Sum
public class PartitionSubSetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum % 2 == 1) return false;
//        Arrays.sort(nums);
        int target = sum / 2; //capacity of the knapsack
        int[] dp = new int[target + 1];
        for (int d : dp)  d =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                //weight: nums[i], value: nums[i]
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }

//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 1; j <= target; j++) {
//                //weight: nums[i], value: nums[i]
//                if (j < nums[i - 1]) dp[j] = dp[j - 1];
//                dp[j] = Math.max(dp[j - 1], dp[j - nums[i - 1]] + nums[i - 1]);
//            }
//        }
        return dp[target] == target;
    }

    public static void main(String[] args) {
        PartitionSubSetSum p = new PartitionSubSetSum();
        int[] nums = {1, 1, 2, 2};
        System.out.println(p.canPartition(nums));
    }
}
