import java.util.*;

public class Hash {
    //532
    //0208
    public static int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>(); //val, freq
        for (int n : nums) hm.put(n, hm.getOrDefault(n, 0) + 1);
        int pairs = 0;

        if (k == 0) {
            for (int n: hm.keySet()) {
                if (hm.get(n) > 1) pairs++;
            }

        }


        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int tmpKey = Math.abs(k - entry.getKey());
            if (hm.containsKey(tmpKey)) {
                pairs += hm.get(tmpKey);
            }
        }
        return pairs;
    }

    //560
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        //store preSum and freq
        hm.put(0, -1);
        int curSum = 0;
        int count = 0;
        for (int n: nums) {
            curSum += n;
            count += hm.get(k - curSum);
            hm.put(curSum, hm.getOrDefault(curSum, 0) + 1);

        }
        return count;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        //Then they ask you to solve it under these constraints:
        //O(n) time and O(1) space (the resulting array of intersections is not taken into consideration).
        //You are told the lists are sorted.

        //Cases to take into consideration include:
        //duplicates, negative values, single value lists, 0's, and empty list arguments.
        //Other considerations might include sparse arrays.
        Arrays.sort(nums1); //[4,9,5,4]-> 4 4 5 9
        Arrays.sort(nums2); //[9,4,9,8,4] -> 4 4 8 9 9
        List<Integer> l = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        if (nums1.length == 0 || nums2.length == 0) return new int[] {};
        int idx1 = 0, idx2 = 0;
        while (idx1 < nums1.length && idx2 < nums2.length) {
            // if (idx1 != 0 && nums1[idx1] == nums1[idx1 - 1]) {
            //     idx1++;
            //     continue;
            // }
            // if (idx2 != 0 && nums2[idx2] == nums2[idx2 - 1]) {
            //     idx2++;
            //     continue;
            // }
            if (nums1[idx1] == nums2[idx2]) {
                // l.add(nums1[idx1]);
                hs.add(nums1[idx1]);
                idx1++;
                idx2++;
            }
            else if (nums1[idx1] < nums2[idx2]) idx1++;
            else idx2++;
        }
        // int[] res = new int[l.size()];
        int[] res = new int[hs.size()];
        Iterator iter = hs.iterator();
        while (iter.hasNext()) l.add((Integer) iter.next());
        for (int i = 0; i < l.size(); i++) res[i] = l.get(i);
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        System.out.println(subarraySum(nums, k));


    }
}
