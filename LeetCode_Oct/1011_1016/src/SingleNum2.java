//1016
//137 Single Number II

public class SingleNum2 {
    public int singleNumber(int[] nums) {
        //HashMap accepted
        //bit manipulation
//        int initial = 0;
//        for (int i = 0; i < nums.length; i++) {
//            xor ^= nums[i];
//        }
//        return initial ^ nums[nums.length - 1];
        return 0;
    }

    public static void main(String[] args) {
        SingleNum2 sn2 = new SingleNum2();
        int[] n ={0,1,0,1,0,1,99};
//        System.out.println(sn2.singleNumber(n));
        System.out.println(1 &~ 0);
    }
}
