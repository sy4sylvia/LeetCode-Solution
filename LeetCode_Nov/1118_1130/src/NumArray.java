//1120
// 303. Range Sum Query - Immutable

public class NumArray {
    private int[] aux;
    public NumArray(int[] nums) {
        aux =  new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) aux[i + 1] = nums[i] + aux[i];
    }

    public int sumRange(int left, int right) {
        return aux[right + 1] - aux[left];
    }

    public static void main(String[] args) {
        int[] n = {5, 6, 3, 2, 1};
        NumArray na = new NumArray(n);
        System.out.println(na.sumRange(1, 4));
    }
}
