//1025
//1920 Build Array from Permutation

public class BuildArr {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) ans[i] = nums[nums[i]];
        return ans;
    }

    public static void main(String[] args) {
        BuildArr ba = new BuildArr();
        int[] number = {0,2,1,5,3,4};
        int[] result = ba.buildArray(number);
        for (int r :result) System.out.println(r);
    }
}
