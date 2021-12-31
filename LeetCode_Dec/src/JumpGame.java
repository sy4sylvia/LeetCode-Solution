

import java.util.Arrays;

enum Index {
    GOOD, BAD, UNKNOWN
}


public class JumpGame {

    //top-down with memoization
//    Index[] memo;
//
//    public boolean canJump(int[] nums) {
//        memo = new Index[nums.length];
//        Arrays.fill(memo, Index.UNKNOWN);
//        memo[memo.length - 1] = Index.GOOD;
//        return canJumpFrom(nums, 0);
//    }
//
//
//    private boolean canJumpFrom(int[] nums, int pos) {
//        if (memo[pos] != Index.UNKNOWN) {
//            return memo[pos] == Index.GOOD ? true : false;
//        }
//        int furthestJump = Math.min(pos + nums[pos], nums.length - 1);
//        for (int nextPos = pos + 1; nextPos <= furthestJump; nextPos++) {
//            if (canJumpFrom(nums, nextPos)) {
//                memo[pos] = Index.GOOD;
//                return true;
//            }
//        }
//        memo[pos] = Index.BAD;
//        return false;
//    }
    public boolean canJump(int[] nums) {
        //initialization
        Index[] memo = new Index[nums.length];
        Arrays.fill(memo, Index.UNKNOWN);
        memo[memo.length - 1] = Index.GOOD;
        for (int curPos = nums.length - 2; curPos >= 0; curPos--) {
            int furthestJump = Math.min(curPos + nums[curPos], nums.length - 1);
            for (int nextPos = curPos + 1; nextPos <= furthestJump; nextPos++) {
                if (memo[nextPos] == Index.GOOD) {
                    memo[curPos] = Index.GOOD;
                    break;
                }
            }
        }
        return memo[0] == Index.GOOD;
    }

    public static void main(String[] args) {
        JumpGame jg = new JumpGame();
        int[] nums = {2, 0};
        System.out.println(jg.canJump(nums));
    }
}
