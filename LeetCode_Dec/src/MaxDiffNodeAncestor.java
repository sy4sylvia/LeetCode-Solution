//1230
//1026. Maximum Difference Between Node and Ancestor

public class MaxDiffNodeAncestor {
    int maxDiff = 0;

    public int maxAncestorDiff(TreeNode root) {
        if (root != null) {
            dfs(root, root.val, root.val);
        }
        return maxDiff;
    }

    private void dfs(TreeNode curNode, int maxVal, int minVal) {
        if (curNode != null) {
            int curVal = curNode.val;
            maxVal = Math.max(maxVal, curVal);
            minVal = Math.min(minVal, curVal);
            maxDiff = Math.max(maxDiff, maxVal - minVal);
            if (curNode.left != null) dfs(curNode.left, maxVal, minVal);
            if (curNode.right != null) dfs(curNode.right, maxVal, minVal);

        }

    }
}

