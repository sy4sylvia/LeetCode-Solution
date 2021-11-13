//1105
//260 Single Number III

import java.util.*;

public class SingleNum3 {
    public int[] singleNumber(int[] nums) {
        if (nums.length == 2) return nums;
        else {
            int[] ans = new int[2];
            List<Integer> l = new ArrayList<>();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                if (Objects.equals(entry.getValue(), 1)) {
                    l.add(entry.getKey());
                }
            }
            for (int i = 0; i < l.size(); i++) ans[i] = l.get(i);
            return ans;
        }
    }

    public static void main(String[] args) {
        SingleNum3 sn3 = new SingleNum3();
        int[] nums = {1,2,1,3,2,5};
        int[] ans = sn3.singleNumber(nums);
        for (int i : ans) System.out.println(i);
    }
}
