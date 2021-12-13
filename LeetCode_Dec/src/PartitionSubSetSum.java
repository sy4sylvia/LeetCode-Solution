import java.util.Arrays;

//1211
// 416 Partition Equal SubSet Sum
public class PartitionSubSetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum % 2 == 1) return false;
        int target = sum / 2; //capacity of the knapsack
        boolean[] dp2 = new boolean[target + 1];
        dp2[0] = true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                if (dp2[j - nums[i]]) dp2[j] = true;
            }
        }
        return dp2[target];


//        int[] dp = new int[target + 1];
//        for (int d : dp)  d = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = target; j >= nums[i]; j--) {
//                //weight: nums[i], value: nums[i]
//                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
//            }
//        }
//
//        return dp[target] == target;
    }

    public static void main(String[] args) {
        PartitionSubSetSum p = new PartitionSubSetSum();
        int[] nums = {1, 2, 5};
        System.out.println(p.canPartition(nums));
    }
}
