//1024
//287 Find the Duplicate Number


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (!Objects.equals(entry.getValue(), 1)) return entry.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        FindDuplicate fd = new FindDuplicate();
        int[] number = {3,1,3,4, 3,2};
        System.out.println(fd.findDuplicate(number));
    }
}
