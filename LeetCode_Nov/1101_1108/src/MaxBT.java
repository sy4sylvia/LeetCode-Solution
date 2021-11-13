//1109
//654 Maximum Binary Tree

public class MaxBT {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helperBuildMax(nums, 0, nums.length);
    }

    private TreeNode helperBuildMax (int[] nums, int left, int right) {
        if (right == left) return null;

        //find max
        int maxVal = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = left; i < right; i++) {
            if (maxVal < nums[i]) {
                maxVal = nums[i];
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(maxVal);
        //left subtree, make sure there is one:

        if (maxIndex > 0) {
            root.left = helperBuildMax(nums, left, maxIndex);
        }
        if (maxIndex < nums.length) {
            root.right = helperBuildMax(nums, maxIndex + 1, right);
        }
        return root;
    }
}
