//10/02
//349. Intersection of Two Arrays

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int i = 0; i < nums1.length; i++) set1.add(nums1[i]);
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) set2.add(nums2[i]);
        }
        int[] res = new int[set2.size()];
        int k = 0;
        for (int x : set2) res[k++] = x;
        return res;
    }

    public static void main(String[] args) {
        Intersection inte = new Intersection();
        int[] n1 = {1,2,2,1};
        int[] n2 = {2, 2, 0};
        int[] wanted = inte.intersection(n1, n2);
        for (int i = 0; i < 1; i++) {
            System.out.println(wanted[i]);
        }

    }
}
