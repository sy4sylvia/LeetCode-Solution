import java.util.Arrays;

//0921 53 Maximum Subarray
//approach 2: dp

//0922 MIT chap4: divide & conquer
public class MaxSubarrays {

    private int[] numbers;

    public int maxSubArray(int[] nums) {

        numbers = nums;
//        int sum = 0;
//        for(int i = 0; i < nums.length - 1; i++) {
//            if((nums[i] + nums[i + 1]) > 0) sum+= nums[i];
//        }
//
//        if(sum != 0 && nums[nums.length - 1] > 0) sum+= nums[nums.length -1];
//        else if(sum == 0 ) {
//            Arrays.sort(nums);
//            sum = nums[nums.length - 1];
//        }
////
////        if(sum == 0) {
////            Arrays.sort(nums);
////            sum = nums[nums.length - 1];
////        }
        return findArray(0, nums.length - 1);
    }



    private int findArray(int left, int right) {
        //base
        if(left > right) return Integer.MIN_VALUE;

        int mid = Math.floorDiv(left + right, 2);
        int leftSum = 0;
        int rightSum = 0;
        int currentSum = 0;

        //mid to left
        for(int i = mid - 1; i >=left; i--) {
            currentSum += numbers[i];
            leftSum = Math.max(currentSum, leftSum);
        }

        currentSum = 0;
        //mid to right
        for(int i = mid + 1; i <= right; i++) {
            currentSum += numbers[i];
            rightSum = Math.max(currentSum, rightSum);
        }

        int bestSum = leftSum + numbers[mid] + rightSum;
        int leftHalf = findArray(left, mid - 1);
        int rightHalf = findArray(mid + 1, right);



        return Math.max(bestSum, Math.max(leftHalf, rightHalf));

    }


    public static void main(String[] args) {
        MaxSubarrays ms = new MaxSubarrays();
        int[] eg = {1,2,-1,-2,2};
        System.out.println(ms.maxSubArray(eg));
    }
}
