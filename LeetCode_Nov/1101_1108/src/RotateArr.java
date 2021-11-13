//189 Rotate Array
//1101

public class RotateArr {
    public void rotate(int[] nums, int k) {
        int[] add = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) add[i] = nums[i];
        for (int i = nums.length; i < 2 * nums.length; i++) add[i] = nums[i - nums.length];

        if (k <= nums.length) {
            for (int i = 0; i < nums.length; i++) nums[i] = add[nums.length - k + i];
        }
        else {
            for (int i = 0; i < nums.length; i++) nums[i] = add[nums.length - k % nums.length + i];
        }
    }

    public static void main(String[] args) {
        RotateArr ra = new RotateArr();
        int[] number = {-1, -100, 3, 99};
        int k = 5;
        ra.rotate(number, k);
        for (int i = 0; i < number.length; i++) System.out.println(number[i]);
    }
}
