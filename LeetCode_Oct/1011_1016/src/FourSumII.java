import java.util.HashMap;

//454 4SumII
//1011
//HashMap
public class FourSumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        int count = 0;
        int n = nums1.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (hm1.containsKey(nums1[i] + nums2[j]))
                    hm1.put(nums1[i] + nums2[j], hm1.get(nums1[i] + nums2[j]) + 1);
                else hm1.put(nums1[i] + nums2[j], 1);
            }
        }

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if (hm1.containsKey(-(nums3[k] + nums4[l]))) count += hm1.get(-(nums3[k] + nums4[l]));
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FourSumII fs = new FourSumII();
        int[] n1 = {1, 2};
        int[] n2 = {-1, -2};
        int[] n3 = {-1, 2};
        int[] n4 = {0, 2};
        System.out.println(fs.fourSumCount(n1, n2, n3, n4));
    }
}
