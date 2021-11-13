//977 two-pointers

public class SquaresOfSortedArr {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int[] result = new int[nums.length];

        for(int i = nums.length - 1; i >= 0; i--) {
            int temp;
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                temp = nums[left++];
            }
            else {
                temp = nums[right--];
            }
            result[i] = temp * temp;
        }
        return result;
    }

    public static void main(String[] args) {
        SquaresOfSortedArr ss =new SquaresOfSortedArr();
        int[] eg = {0, 3, 2, 3};
        int[] op = ss.sortedSquares(eg);
        for(int i: op) System.out.print(i + " ");
        System.out.println();
    }

}


//
//class Solution {
//    public:
//    vector<int> sortedSquares(vector<int>& nums) {
//        int n = nums.size();
//        int left = 0; // ++
//        int right = n - 1; // --
//
//        vector<int> ans (n);
//
//        for(int i = n - 1; i >= 0; i--){ // O(n)
//            int temp;
//            if(abs(nums[left]) < abs(nums[right])){
//                temp = nums[right];
//                right--;
//            }
//            else{
//                temp = nums[left];
//                left++;
//            }
//            ans[i] = temp * temp;
//        }
//
//        return ans;
//    }
//};