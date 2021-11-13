//1029
//912 Sort an Array

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        //1. selections sort: O(n^2) time limit exceeded
        for (int j = 0; j < nums.length - 1; j++) {
            int min = j; //index for the min value
            for (int i = j + 1; i < nums.length; i++) {
                if (nums[min] > nums[i]) min = i;
            }
            int tmp = nums[j];
            nums[j] = nums[min];
            nums[min] = tmp;
        }
        return nums;
    }

    public static void main(String[] args) {
        SortAnArray sa = new SortAnArray();
        int[] num = {5,2,3,1};
        int[] res = sa.sortArray(num);
        for (int i : res) System.out.println(i);
    }
}
