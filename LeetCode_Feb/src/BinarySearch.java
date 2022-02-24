public class BinarySearch {
    //33
    //0207
    public int search(int[] nums, int target) {
        int pivot = getPivotIdx(nums);
        if (pivot == -1) return binarySearch(nums, 0, nums.length - 1, target);
        if (target < nums[0]) return binarySearch(nums, pivot + 1, nums.length - 1, target);
        else if (target > nums[0]) return binarySearch(nums, pivot + 1, pivot, target);
        else if (target == nums[0]) return 0;
        else return -1;
    }

    private int getPivotIdx (int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) return i;
        }
        return -1; //this array is not rotated
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        while (left < right) { //nums from idx left to right is already sorted
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) right = mid;
            else left = mid + 1;
        }
        return -1; //cannot find target
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {4, 5};
        System.out.println(bs.binarySearch(nums, 0, 1, 0));

        System.out.println(Math.pow(2, 3));
        System.out.println(Math.round(2.822));
    }
}
