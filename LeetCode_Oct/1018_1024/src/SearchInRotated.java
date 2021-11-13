//1024
//33
// O(lgn): Binary Search

public class SearchInRotated {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        //could be deleted
//        if (nums.length == 1) {
//            if (nums[0] == target) return 0;
//            else return -1;
//        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
//            else if (nums[mid] > nums[end] && target < nums[end]) {
//                start = mid + 1;  //pivot in the right subarray
//            }
//            else if (nums[mid] > nums[end] && target > nums[mid]) {
//                start = mid + 1;
//            }
//            else if (nums[mid] < nums[end] && target > nums[end]){
//                end = mid;
//            }
//            else if (nums[mid] < nums[end] && target < nums[mid]) {
//                end = mid; //pivot in the left subarray
//            }
            else if (nums[mid] > nums[start]) {
                if (target >= nums[start] && target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            }
            else  {
                if (target > nums[mid] && target <= nums[end]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchInRotated sir = new SearchInRotated();
        int[] number = {3};
        System.out.println(sir.search(number, 3));
    }
}
