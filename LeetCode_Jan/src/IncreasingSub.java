//491 Increasing subsequences
//0126

//subsequence: length at least two

//1 <= nums.length <= 15

//eg1. 4 6 7 7
//ans: 4, 6; 4, 6, 7; 4, 6, 7, 7; 4, 7; 4, 7, 7; 6, 7; 6, 7, 7; 7, 7;

//4 7 6 7

// 4 4 3 2 1 -> 4, 4
//should not sort the array

import java.util.ArrayList;
import java.util.List;

public class IncreasingSub {

    List<List<Integer>> subs = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {

        backtrack(nums, 0);
        return subs;
    }

    private void backtrack(int[] nums, int startIdx) {
        //termination: reached the end of the array
        if (path.size() > 1) subs.add(new ArrayList<>(path));

        int[] used = new int[201];  //-100 ~ 100, a total of 201 possible numbers
        //in every branch there could be duplicates

        for (int i = startIdx; i < nums.length; i++) {

            if (path.size() != 0 && path.get(path.size() - 1) > nums[i]) continue;
            if (used[nums[i] + 100] == 1) continue;

            used[nums[i] + 100] = 1;
            path.add(nums[i]);

            backtrack(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }


    public static void main(String[] args) {
        IncreasingSub is = new IncreasingSub();
        int[] nums = {4, 6, 7, 7};
        System.out.println(is.findSubsequences(nums));
    }
}
