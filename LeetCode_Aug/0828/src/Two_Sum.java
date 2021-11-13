import java.util.Arrays;
//11
public class Two_Sum {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for(int a = 0; a < nums.length; a++){
            for(int b = a + 1; b < nums.length; b++){
                if(nums[a] + nums[b] == target){
                    result[0] = a;
                    result[1] = b;
                }
            }
        }
        return result;
    }

//167
    public int[] twoSumBeta(int[] nums, int target){
        Arrays.sort(nums);
        int a = 0;
        int b = nums.length - 1;
        int[] re = new int[2];

        while (nums[a] + nums[b] != target && a < nums.length){
            if(nums[a] + nums[b] < target){
                a++;
            }
            else{
                b--;
            }
        }
        re[0] = a + 1;
        re[1] = b + 1;
        return re;
    }


    public static void main(String[] args) {
        Two_Sum ts = new Two_Sum();
        int[] numsnew = new int[]{3, 3, 4, 1};
        for (int i : ts.twoSum(numsnew, 6)) {
            System.out.println(i);
        }
//        System.out.println(ts.twoSum(numsnew, 6));
    }
}
