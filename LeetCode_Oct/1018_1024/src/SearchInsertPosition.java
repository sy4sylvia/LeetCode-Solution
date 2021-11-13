//1022
// 35. Search Insert Position
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) end = mid - 1; //left-subarray
            else start = mid + 1; //right-subarray
        }
        return start;
    }

    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] a = {1, 3, 5, 6};
        int k = 2;
        System.out.println(sip.searchInsert(a, k));
    }
}
