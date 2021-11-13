//53

import java.util.ArrayList;
import java.util.Collections;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int currentSum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        if(nums.length == 1) sum = nums[0];
        else {
            for(int i = 0; i < nums.length - 1; i++) {
                if((nums[i + 1] + nums[i]) > 0){
                    currentSum += nums[i];
                    al.add(currentSum);
                }
            }
        }
        Collections.sort(al);
        sum = al.get(al.size() - 1);
        return sum;
    }

    public static void main(String[] args) {
        MaximumSubarray ms = new MaximumSubarray();
        int[] number = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ms.maxSubArray(number));
    }
}
