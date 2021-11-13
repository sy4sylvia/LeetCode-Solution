//1025
//1512 Number of Good Pairs

public class NumofGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int[] table = new int[101];
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            table[val]++;
        }
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (table[i] > 1) sum += table[i] * (table[i] - 1) / 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        NumofGoodPairs gp = new NumofGoodPairs();
        int[] nums = {1, 2, 3, 3, 2, 2};
        System.out.println(gp.numIdenticalPairs(nums));
    }
}
