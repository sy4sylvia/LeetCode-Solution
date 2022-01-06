//0106
//4. Median of Two Sorted Arrays


import java.util.Arrays;
import java.util.PriorityQueue;

public class Median {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int m = nums1.length, n = nums2.length;
//        int idx1 = 0, idx2 = 0;
//        int mid1 = 0, mid2 = 0;
//
//        for (int i = 0; i <= (m + n) / 2; i++) {
//            mid1 = mid2;
//            if (idx1 == m) {
//                mid2 = nums2[idx2++];
//            }else if (idx2 == n) {
//                mid1 = nums1[idx1++];
//            }else if (nums1[idx1] < nums2[idx2]) {
//                mid2 = nums1[idx1++];
//            }else {
//                mid2 = nums2[idx2++];
//            }
//        }
//        if ((m + n) % 2 == 0) return (mid1 + mid2) * 0.5;
//        return mid2;
//    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] nums = new int[m + n];
        int idx1 = 0, idx2 = 0;
        if (m == 0) {
            if (n % 2 != 0) return nums2[n / 2];
            else return (nums2[n / 2] + nums2[n / 2 - 1]) * 0.5;
        }
        if (n == 0) {
            if (m % 2 != 0) return nums1[m / 2];
            else return (nums1[m / 2] + nums1[m / 2 - 1]) * 0.5;
        }

        for (int n1 = 0; n1 < m; n1++) nums[n1] = nums1[n1];
        for (int n2 = 0; n2 < n; n2++) nums[m + n2] = nums2[n2];
        Arrays.sort(nums);

        if ((m + n) % 2 != 0) return nums[(m + n) / 2];
        else return (nums[(m + n) / 2] + nums[(m + n) / 2 - 1]) * 0.5;
    }

    public static void main(String[] args) {
        Median m = new Median();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(m.findMedianSortedArrays(nums1, nums2));
    }

    //build a max and min heap
}
