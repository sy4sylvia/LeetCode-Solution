//1128
//41 First Missing Positive
// O(n) time and uses constant extra space.
//1 <= nums.length <= 5 * 105

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int ans = nums[0];


//        for (int i = 0; i < nums.length; i++) {
//            int index = Math.abs(nums[i]) - 1;
//            if (nums[index] < 0) {
//                ans = Math.abs(index + 1);
//            }
//            nums[index] *= -1;
//        }
        return ans;
    }

    public static void main(String[] args) {
        FirstMissingPositive fm = new FirstMissingPositive();
        int[] nums = {3,4,-1,1, 1, 1, 5, 6};
        System.out.println(fm.firstMissingPositive(nums));
    }
}
