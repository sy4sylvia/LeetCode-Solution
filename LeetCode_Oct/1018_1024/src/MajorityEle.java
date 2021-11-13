//169 Majority Element
//1018

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityEle {
//    public int majorityElement(int[] nums) {
//        if (nums.length == 1) return nums[0];
//        else {
//            HashMap<Integer, Integer> hm = new HashMap<>();
//
//            for (int i = 0; i < nums.length; i++) {
//                if (!hm.containsKey(nums[i])) hm.put(nums[i], 1);
//                else hm.put(nums[i], hm.get(nums[i]) + 1);
//            }
//
//            int maxVal = Collections.max(hm.values());
//            for (Map.Entry<Integer, Integer> en : hm.entrySet()) {
//                if (en.getValue() == maxVal) {
//                    return en.getKey();
//                }
//            }
//            return nums[0];
//
//        }
//    }

    public int majorityElement(int[] nums) {
        //using sort
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }


    public static void main(String[] args) {
        MajorityEle me = new MajorityEle();
        int[] number = {7, 2, 2,2, 2, 1, 7};
        System.out.println(me.majorityElement(number));

    }
}


