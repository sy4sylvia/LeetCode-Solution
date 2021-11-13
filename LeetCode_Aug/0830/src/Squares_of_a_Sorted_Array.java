//977

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        int[] numsquares = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            numsquares[i] = nums[i] * nums[i];
        }
        Arrays.sort(numsquares);
        return numsquares;
    }

    public static void main(String[] args) {
        Squares_of_a_Sorted_Array sa = new Squares_of_a_Sorted_Array();
        int[] numsnew = new int[]{-4,-1,0,3,10};
        int[] result = sa.sortedSquares(numsnew);
        for (int i: result) System.out.print(i + " ");
        System.out.println();
    }
}
