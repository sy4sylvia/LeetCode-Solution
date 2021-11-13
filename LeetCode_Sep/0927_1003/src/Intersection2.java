//10/02
//350. Intersection of Two Arrays II

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i : nums1) hm1.put(i, hm1.getOrDefault(i, 0) + 1);

        int k = 0;
        for (int j : nums2) {

            if (hm1.getOrDefault(j, 0) > 0) {
                result.add(j);
                k++;
                hm1.put(j, hm1.getOrDefault(j, 0) - 1);
            }
        }

        int[] res = new int[result.size()];
        for (int m = 0; m < k; m++) res[m] = result.get(m);
        return res;

    }

    public static void main(String[] args) {
        Intersection2 i2 = new Intersection2();
        int[] n1 = {1,2,2,1};
        int[] n2 = {2, 2, 0};
        int[] wanted = i2.intersect(n1, n2);
        for (int i = 0; i < 2; i++) {
            System.out.println(wanted[i]);
        }
    }
}



//accepted solution

//changed the original array and returned some of its first elements
//
//    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//        for (int i : nums1) hm.put(i, hm.getOrDefault(i, 0) + 1);
//                int k = 0;
//                for (int j : nums2) {
//                if (hm.getOrDefault(j, 0) > 0) {
//                nums1[k++] = j;
//                hm.put(j, hm.getOrDefault(j, 0) - 1);
//                }
//                }
//                return Arrays.copyOf(nums1, k);


