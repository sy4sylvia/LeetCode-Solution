import java.util.Arrays;

// 10/07
//88. Merge Sorted Array

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (m == 0) {
//            for (int i = 0; i < n; i++) nums1[i] = nums2[i];
//        } else if (m > 0 && n > 0) {

        int pointer1 = m - 1, pointer2 = n - 1;
        for (int pointer0 = m + n - 1; pointer0 >= 0; pointer0--) {
            if (pointer1 >= 0 && pointer2 >= 0) {
                if (nums2[pointer2] > nums1[pointer1]) {
                    nums1[pointer0] = nums2[pointer2--];
                } else {
                    nums1[pointer0] = nums1[pointer1--];
                }
            }
            else if (pointer1 < 0 && pointer2 >= 0) nums1[pointer0] = nums2[pointer2--];
        }
    }




    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int[] n1 = {1};
        int[] n2 = {0};
        int m = 1, n = 0;
        msa.merge(n1, m, n2, n);

        for (int i = 0; i < 1; i++) System.out.println(n1[i]);
    }

}
