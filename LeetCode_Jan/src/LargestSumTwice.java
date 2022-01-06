//0103
//747. Largest Number At Least Twice of Others
//0 <= nums[i] <= 100
public class LargestSumTwice {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0;
        int largest = 0, secondL = 0;
        int resIdx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                resIdx = i;
            }
        }

        for (int n : nums) {
            if (n < largest && n > secondL) secondL = n;
        }
        if (largest >= secondL * 2) return resIdx;
        else return -1;
    }

    public static void main(String[] args) {
      LargestSumTwice lst = new LargestSumTwice();
      int[] num = {3, 5, 7};
      System.out.println(lst.dominantIndex(num));
    }
}
