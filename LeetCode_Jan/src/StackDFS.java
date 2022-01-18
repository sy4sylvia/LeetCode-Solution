import java.util.ArrayList;
import java.util.List;

public class StackDFS {

    //494 Target Sum
    //nums.length >=1
    int ways = 0;
    public int findTargetSumWays(int[] nums, int target) {
        helpPath(nums, target, 0, 0);
        return ways;
    }
    private void helpPath(int[] nums, int target, int idx, int curSum) {
        if (idx == nums.length) {
            if (target == curSum) ways++;
            return;
        }
        helpPath(nums, target, idx + 1, curSum + nums[idx]);
        helpPath(nums, target, idx + 1, curSum - nums[idx]);
    }
}
