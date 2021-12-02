//108 Convert Sorted Array to Binary Search Tree
//1117

public class ArrToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helperConvert(nums, 0, nums.length); //[left, right)
    }

    private TreeNode helperConvert(int[] nums, int left, int right) {
        if (right == left) return null;
        if (right - left == 1) return new TreeNode(nums[left]);
        int mid = left + (right - left) / 2;
        int rootVal = nums[mid];
        TreeNode root = new TreeNode(rootVal);
        root.left = helperConvert(nums, left, mid);
        root.right = helperConvert(nums, mid + 1, right);
        return root;
    }
}
