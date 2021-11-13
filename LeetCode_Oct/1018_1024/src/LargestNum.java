//1029
//179 Largest Number
//should not use Radix Sort since the least significant digit is prioritized

public class LargestNum {
    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
//        int[] digits = new int[nums.length];
//        int[] table = new int[10];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]>= 10) table[nums[i] % 10] = nums[i] ;
//            else table[nums[i]] = nums[i];
        // would fail for cases: 44, 34
//        }
        int[] res = new int[nums.length];
        int max = nums[0];
        for (int n : nums) {
            if (max < n) max = n;
        }
        for (int s = 1; max / s > 0; s*= 10) {
            countingSortForRadix(nums, s);
        }
        for (int i = 0; i < nums.length; i++) sb.append(nums[i]);
        return sb.toString();
    }


    private void countingSortForRadix(int[] nums, int s) {
        //using counting sort for radix
        int[] countingArr = new int[10]; //base-10, range 0 - 9
        for (int i = 0; i < nums.length; i++) {
            countingArr[(nums[i] / s) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            countingArr[i] += countingArr[i - 1];
        }
        int[] outputArr = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            outputArr[--countingArr[(nums[i] / s) % 10]] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) nums[i] = outputArr[i];
    }

//    private void radixSort(int[] nums) {
//        int max = nums[0];
//        for (int n : nums) {
//            if (max < n) max = n;
//        }
//    }

    public static void main(String[] args) {
        LargestNum ln = new LargestNum();
        int[] number = {3,30,34,5,9};
        System.out.println(ln.largestNumber(number));
    }
}
