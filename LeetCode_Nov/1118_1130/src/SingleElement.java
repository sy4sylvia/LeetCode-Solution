//1120
//540 SIngle Element in a Sorted Array

//Your solution must run in O(log n) time and O(1) space.
//binary search: O(lgn)

public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int lowerBound = 0, upperBound = nums.length - 1;
        while (lowerBound <= upperBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;

            int leftNumElements = mid - lowerBound;
            if (mid == 0) return nums[0];
            if (mid == nums.length - 1) return nums[nums.length - 1];

            if (leftNumElements % 2 == 0) {
                if (nums[mid] == nums[mid - 1]) upperBound = mid - 2;
                if (nums[mid] == nums[mid + 1]) lowerBound = mid + 2;
            }
            if (leftNumElements % 2 == 1) {
                if (nums[mid] == nums[mid - 1]) lowerBound = mid + 1;
                if (nums[mid] == nums[mid + 1]) upperBound = mid - 1;
            }
            if ((nums[mid] != nums[mid - 1]) && (nums[mid] != nums[mid + 1])) return nums[mid];
        }
        return -1;
    }

    public static void main(String[] args) {
        SingleElement se = new SingleElement();
        int[] n = {1, 1,2,2,3, 3, 4, 4, 5};
        System.out.println(se.singleNonDuplicate(n));
    }
}
