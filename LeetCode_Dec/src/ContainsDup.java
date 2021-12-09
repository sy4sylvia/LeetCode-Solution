//1203
// 217. Contains Duplicate

import java.util.HashMap;

public class ContainsDup {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) hm.put(nums[i], 1);
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDup cd = new ContainsDup();
        int[] number = {-1000000000, -1000000000};
        System.out.println(cd.containsDuplicate(number));
    }
}
