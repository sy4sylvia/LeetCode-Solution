//1021
//270 Closest Binary Search Tree Value

import java.util.ArrayList;
import java.util.Map;

public class ClosestBSTVal {
    public int closestValue(TreeNode root, double target) {
        int closest = root.val;
        while (root != null) {
            int changingVal = root.val;
            closest = Math.abs(changingVal - target) < Math.abs(closest - target) ? changingVal : closest;
            root = root.val > target ? root.left : root.right;
        }
        return closest;
    }

//    private int search(TreeNode root, int val) {
//        if (root == null || val == root.val) return root.val;
//        //consider the scenario where the tree is empty
//        return val < root.val ? search(root.left, val) : search(root.right, val);
//    }
}
