//1125
//55 Jump Game

public class JumpGame {
    public boolean canJump(int[] nums) {
        //greedy
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) lastPos = i;
        }
        return lastPos == 0;

//        int firstPos = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (firstPos + nums[firstPos] >= i) firstPos = i;
//        }
//        return firstPos == nums.length - 1;
    }

    public static void main(String[] args) {
        JumpGame jg = new JumpGame();
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(jg.canJump(nums));
    }
}
