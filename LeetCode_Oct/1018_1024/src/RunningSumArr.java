//1023
//1480 Running Sum of 1d Array

public class RunningSumArr {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums. length; i++) {
            sum += nums[i];
            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        RunningSumArr rsa = new RunningSumArr();
        int[] number = {3,1,2,10,1};
        int[] ans = rsa.runningSum(number);
        for (int n = 0; n < number.length; n++)
            System.out.println(ans[n]);
    }
}
