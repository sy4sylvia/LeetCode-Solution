//0103
//724. Find Pivot Index

public class FindPivotIdx {
    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; i++) prefixSum[i] = nums[i - 1] + prefixSum[i - 1];
        //prefixSum[0] = 0, prefixSum[n] = nums[0] + ... + nums[n - 1]

        // for (int p : prefixSum) System.out.print(p + " ");

        for (int i = 0; i < prefixSum.length - 1; i++) {
            if (prefixSum[i] * 2 + nums[i] == prefixSum[prefixSum.length - 1]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotIdx fpi = new FindPivotIdx();
        int[] nums = {1,7,3,6,5,6};

        //prefixSum = {0 1 8 11 17 22 28 };
        //Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
        //Right sum = nums[4] + nums[5] = 5 + 6 = 11
        //11 + 6 + 11 = 28
        System.out.println(fpi.pivotIndex(nums));

    }
}
