//1117
//448 Find All Numbers Disappeared in an Array

import java.util.*;

public class FindAllNumDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) hm.put(nums[i],hm.getOrDefault(nums[i], 0) + 1);

//        if (nums.length == 1 && nums[0] != 1) l.add(1);
//        int max = nums[nums.length - 1];
//        if (max == 1 && nums.length > 1) {
//            for (int i = 1; i < nums.length; i++) {
//                if (!hm.containsKey(i + 1)) l.add(i + 1);
//            }
//        }

        for (int i = 1; i <= nums.length; i++) {
            if (!hm.containsKey(i)) l.add(i);
        }
//        for (int i = 1; i <= nums.length; i++) {
//            if (!hm.containsKey(i)) l.add(i);
//        }
        return l;
    }

    public static void main(String[] args) {
        FindAllNumDisappeared dis = new FindAllNumDisappeared();
        int[] nums = {1, 1, 1};
        System.out.println(dis.findDisappearedNumbers(nums));
    }
}
