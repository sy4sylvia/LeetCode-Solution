//1023
//153. Find Minimum in Rotated Sorted Array

import java.lang.module.FindException;

public class FindMinRotated {
//    public int findMin(int[] nums) {
//        int start = 0, end = nums.length - 1;
//
//        while (start <= end){
//            int mid = start + (end - start) / 2;
//
//            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
//            if (nums[mid] < nums[mid + 1]) return nums[mid];
//
//            if (nums[mid] > nums[0]) {
//                start = mid + 1;
//            }
//            else {
//                end = mid - 1;
//            }
//        }
////
////
////        if (nums[start] < nums[end]) return nums[0];
////        else {
////
////        }
//
//        return nums[0];
//    }

    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        if (nums[start] < nums[end] || nums.length == 1) return nums[0];
        else {
            while (start < end){
                int mid = start + (end - start) / 2;
                if (nums[mid] < nums[end]) end = mid;
                else start = mid + 1;
            }
            return nums[start];
        }
    }

    public static void main(String[] args) {
        FindMinRotated fmr = new FindMinRotated();
        int[] number = {6, 1, 2, 3, 4};
        System.out.println(fmr.findMin(number));
    }
}
