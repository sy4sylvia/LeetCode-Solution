public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        if (nums.length == 2) {
            result[0] = 0;
            result[1] = 1;
        }
        else {
            for(int a = 0; a < nums.length; a++){
                for(int b = a + 1; b < nums.length; b++){
                    if(nums[a] + nums[b] == target){
                        result[0] = a;
                        result[1] = b;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] eg = {0, 3, 4, 3};
        for(int i : ts.twoSum(eg, 6)) System.out.println(i);
    }
}
