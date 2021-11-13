//10188888???
//15 3 Sum
//HashMap

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum < 0) ++left;
                    else if (sum > 0) --right;
                    else {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) ++left;
                    }
                }

            }
        }
        return result;
    }
}





//class Solution {
//
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<>();
//        for(int i = 0; i < nums.length - 1 && nums[i] <= 0; i++) {
//            if (i == 0 || nums[i - 1] != nums[i]) twoSum2(nums, i, result);
//        }
//        return result;
//    }
//
//    void twoSum2(int[] nums, int i, List<List<Integer>> result){
//        int left = i + 1, right = nums.length - 1;
//        while(left < right) {
//            int sum = nums[i] + nums[left] + nums[right];
//            if(sum < 0) ++left;
//            else if(sum > 0) --right;
//            else {
//                result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
//                while (left < right && nums[left] == nums[left - 1]) ++left;
//            }
//        }
//    }
//}
