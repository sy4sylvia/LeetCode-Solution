//1099 Two Sum Less Than K
//1017

import java.util.Arrays;

public class TwoSumLessThanK {
    public int twoSumLessThanK(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        int sum = 0;
        Arrays.sort(nums);
        while (left < nums.length - 1 && right >= 0 && left != right) { //left!=right!!!!!!!!!!
            if (nums[left] + nums[right] < k) {
                if (nums[left] + nums[right] > sum) {
                    sum = nums[left] + nums[right];
                }
                if (nums[left] <= nums[right]) left++;
                else right--;
            }
            else {
                if (nums[left] <= nums[right]) right--;
                else left++;
            }
        }
        if (sum == 0) return -1;
        else return sum;
    }

    public static void main(String[] args) {
        TwoSumLessThanK tsltk = new TwoSumLessThanK();
        int[] number = {358,898,450,732,672,672,256,542,320,573,423,543,591,280,399,923,920,254,135,952,115,536,143,896,411,722,815,635,353,486,127,146,974,495,229,21,733,918,314,670,671,537,533,716,140,599,758,777,185,549};
//        Arrays.sort(number);
//        for (int i : number) System.out.print(i + " ");
        int target = 1800;

        System.out.println(tsltk.twoSumLessThanK(number, target));
    }
}
