import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//two-pointers

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if((nums.length < 3) || (nums.length == 3 && (nums[0] + nums[1] + nums[2]) != 0)) result = Collections.emptyList();
//        if() return result;
        if(nums.length == 3 && (nums[0] + nums[1] + nums[2]) == 0) {
            result.add(Arrays.asList(nums[0], nums[1], nums[2]));
        }
        else {
            for(int i = 0; i < nums.length; i++) {
                twoSum2(nums, i, result);
            }
        }
        return result;
    }

    public void twoSum2(int[] nums, int i, List<List<Integer>> result){
        Arrays.sort(nums);
        int left = i + 1, right = nums.length - 1;
        while(left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if(sum < 0) ++left;
            else if(sum > 0) --right;
            else {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                while (left < right && nums[left] == nums[left + 1]) left++;
            }
        }
    }
}



//class Solution {
//
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<>();
////         if((nums.length < 3) || (nums.length == 3 && (nums[0] + nums[1] + nums[2]) != 0)) result = Collections.emptyList();
//// //        if() return result;
////         if(nums.length == 3 && (nums[0] + nums[1] + nums[2]) == 0) {
////             result.add(Arrays.asList(nums[0], nums[1], nums[2]));
////         }
////         else {
//            for(int i = 0; i < nums.length && nums[i] <= 0; ++i) {
//                if (i == 0 || nums[i - 1] != nums[i]) twoSum2(nums, i, result);
//            }
//        // }
//        return result;
//    }
//
//    public void twoSum2(int[] nums, int i, List<List<Integer>> result){
//        int left = i + 1, right = nums.length - 1;
//        while(left < right) {
//            int sum = nums[i] + nums[left] + nums[right];
//            if(sum < 0) ++left;
//            else if(sum > 0) --right;
//            else {
//                result.add(Arrays.asList(nums[i], nums[left--], nums[right++]));
//                while (left < right && nums[left] == nums[left - 1]) ++left;
//            }
//        }
//    }
//}
