//1023
//154 Find Minimum in Rotated Sorted Array II

public class FindMin {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (min > n) min = n;
        }
        return min;
    }

    public static void main(String[] args) {
        FindMin fm = new FindMin();
        int[] number = {2, 3, 2, 0, 1};
        System.out.println(fm.findMin(number));
    }
}
