//1024
//81 Search in Rotated Sorted Array II
//how to implement in Binary Search??

public class SearchInRotatedII {
    public boolean search(int[] nums, int target) {
        for (int n : nums) {
            if (n == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchInRotatedII s2 = new SearchInRotatedII();
        int[] num = {1, 0, 0, 1, 1, 1};
        System.out.println(s2.search(num, 1));
    }
}
