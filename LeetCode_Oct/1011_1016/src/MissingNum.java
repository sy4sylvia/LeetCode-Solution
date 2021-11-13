//268 Missing Number
//1015

import java.util.HashSet;

public class MissingNum {


//    public int missingNumber(int[] nums) {
//        HashSet<Integer> hs = new HashSet<>();
//        for (int n : nums) hs.add(n);
//        for (int i = 0; i < nums.length + 1; i++) {
//            if (!hs.contains(i)) return i;
//        }
//        return -1;
//    }


    //bit manipulation????

//    public static int missingNumber(int[] nums) {
//        int i = 0, xor = 0;
//        for (i = 0; i < nums.length; i++) xor = xor ^ i ^ nums[i];
//        return xor ^ i;
//    }


    public static int missingNumber(int[] nums) {
        int range = nums.length;
        for (int i = 0; i < nums.length; i++) range += i - nums[i];
        return range;
    }



    public static void main(String[] args) {
        MissingNum mn = new MissingNum();
        int[] ex = {9,6,4,2,3,5,7,0,1};
        System.out.println(mn.missingNumber(ex));
    }
}
