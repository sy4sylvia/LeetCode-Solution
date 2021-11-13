//1104
//111 Minimum Depth of Binary Tree

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinDepthOfBT {
    //DFS

    int minLevel= Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            helper(root, 0);
            return minLevel + 1;
        }
    }

    private void helper(TreeNode root, int level) {
        if (root.left != null) {
            helper(root.left, level + 1);
        }
        if (root.right != null) {
            helper(root.right, level + 1);
        }
        if (root.left == null && root.right == null) {
            if (minLevel > level) {
                minLevel = level;
            }
        }
    }
}
