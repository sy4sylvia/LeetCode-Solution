//704
public class BinarySearch {
    public int search(int[] nums, int target) {
        int middle = nums.length / 2;
        int left = 0;
        int right = nums.length - 1;

        if (target < nums[left] || target > nums[right]) {
            return -1;
        }
//        if(nums.length == 1 && nums[0] == target){
//            return 0;
//        }

        while(0 <= right && left < nums.length && left <= right){
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
//                if (right - middle <= 1){
//                    middle += 1;
//                }else{
//                    middle += (right - middle) / 2;
//                }
                left = middle + 1;
            } else if (nums[middle] > target) {
//                if(middle - left <= 1){
//                    middle -= 1;
//                }else{
//                    middle -= (middle - left) / 2;
//                }
                right = middle - 1;
            }
            middle = (left + right) / 2;
        }
        return -1;
    }


//            while(n != target){
//                if(n < target){
//                    if(index > 0){
//                        index += (nums.length - index) / 2;
//                    }
//                    else{
//                        return -1;
//                    }
//                }
//                else{
//                    if(index < nums.length){
//                        index -= (nums.length - index) / 2;
//                    }
//                    else{
//                        return -1;
//                    }
//                }
//                n = nums[index];
//            }
//            return index;


    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] numsnew = new int[]{1, 2, 3, 9, 66};
        System.out.println(bs.search(numsnew, 66));
    }
}
