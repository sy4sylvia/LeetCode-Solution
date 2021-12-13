//1212
//485. Max Consecutive Ones

public class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            }
            if (num == 0) {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ConsecutiveOnes co = new ConsecutiveOnes();
        int[] nums = {0};
        System.out.println(co.findMaxConsecutiveOnes(nums));
    }
}
