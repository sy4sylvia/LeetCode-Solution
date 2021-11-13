//209

public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
//        int output;
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] >= target) output = 1;
//            else{
//                }
//            }
        int i = 0;
        int count = 0;
        int sum = 0;

        while (i < nums.length) {
            while(sum != target){
                sum += nums[i];
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Minimum_Size_Subarray_Sum msss = new Minimum_Size_Subarray_Sum();
        int[] numsnew = new int[]{2,3,1,2,4,3};
        int output = msss.minSubArrayLen(7, numsnew);
        System.out.println(output);
    }
}
