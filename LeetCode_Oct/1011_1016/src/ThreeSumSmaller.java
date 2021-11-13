//1017
//259 3Sum smaller

import java.util.Arrays;

public class ThreeSumSmaller {
//    public int threeSumSmaller(int[] nums, int target) {
//        if (nums.length < 3) return 0;
//        else if (nums.length == 3 && (nums[0] + nums[1] + nums[2] >= target)) return 0;
//        else {
//            Arrays.sort(nums);
//            int count = 0;
//            for (int i = 0; i < nums.length - 2; i++) {  // length - 2
//                count += twoSum(nums, i + 1, target - nums[i]);
//
//            }
//            return count;
//        }
//    }
//
//    private int twoSum(int[] nums, int index, int target) {
//        int left = index, right = nums.length - 1;
//        int sum = 0;
//        while (left < right) {
//            if (nums[left] + nums[right] < target) {
//                sum += right - left;
//                left++;
//            }
//            else {
//                right--;
//            }
//        }
//        return sum;
//    }

        public int threeSumSmaller(int[] nums, int target) {
        if (nums.length < 3) return 0;
        else if (nums.length == 3 && (nums[0] + nums[1] + nums[2] >= target)) return 0;
        else {
            Arrays.sort(nums);
            int count = 0;
            for (int i = 0; i < nums.length - 2; i++) {  // length - 2
                int left = i + 1, right = nums.length - 1;

                while (left < right) {
                    if (nums[left] + nums[i] + nums[right] < target) {
                        count += right - left;
                        left++;
                        //For guys that get confused by “count += right-left;”:
                        //As we have sort the elements in nums array,
                        // then for a triple i,left,right that matches requirement( sum<target),
                        // any elements that smaller than nums[right] and larger than nums[left] can still match it,
                        // as the sum can only go smaller.
                        // How many alternatives/elements that are smaller than nums[right] and larger than nums[left]?
                        // right - left.
                    }
                    else right--;
                }
            }
            return count;
        }
    }


    public static void main(String[] args) {
        ThreeSumSmaller th = new ThreeSumSmaller();
        int[] numb= {-3, -2, 0, 1, 3, 4, 5, 6};
        int tar = 2;
        System.out.println(th.threeSumSmaller(numb, tar));
    }
}



