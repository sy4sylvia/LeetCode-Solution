//0923
//209 Minimum Size Subarray Sum
//two-pointer
public class MinSizeSubSum {
    public int minSubArrayLen(int target, int[] nums) {
        int head = 0, sum = 0, result = Integer.MAX_VALUE;
        for(int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while(sum >= target) {
                result = Math.min(result, end - head + 1);
                sum -= nums[head++];
            }
        }
        if(result == Integer.MAX_VALUE) return 0;
        else return result;
//        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        MinSizeSubSum msss = new MinSizeSubSum();
        int[] eg = {1,7,3,4,1,1};
        System.out.println(msss.minSubArrayLen(7, eg));
    }
}


