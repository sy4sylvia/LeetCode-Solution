//1128
//442  Find All Duplicates in an Array
//1 ≤ arr[i] ≤ n

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindAllDupsInArr {
//    public List<Integer> findDuplicates(int[] nums) {
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
//        List<Integer> ans = new ArrayList<>();
//        if (nums.length == 1) return ans;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (hm.get(nums[i]) == 2) {
//                ans.add(nums[i]);
//                hm.put(nums[i], 1);
//            }
//        }
//        return ans;
//    }

//    public List<Integer> findDuplicates(int[] nums) {
//        HashSet<Integer> tmp = new HashSet<>();
//        List<Integer> ans = new ArrayList<>();
//        if (nums.length == 1) return ans;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (!tmp.contains(nums[i])) tmp.add(nums[i]);
//            else ans.add(nums[i]);
//        }
//        return ans;
//    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums.length == 1) return ans;

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            System.out.print(index + " ");
            System.out.println(nums[index]);
            if (nums[index] < 0) ans.add(Math.abs(index + 1));
            nums[index] *= -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        FindAllDupsInArr fd = new FindAllDupsInArr();
        int[] nums = {7, 2, 3, 3, 4, 5, 6};
        System.out.println(fd.findDuplicates(nums));
    }
}
