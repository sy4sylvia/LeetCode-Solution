//1213
//938 Range Sum of BST

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class RangeSumOfBST {

    List<Integer> lVal = new ArrayList<>();
    public int rangeSumBST(TreeNode root, int low, int high) {
        helperDFS(root);
        int sum = 0;
        for (int i = 0; i < lVal.size(); i++) {
            if (lVal.get(i) >= low && lVal.get(i) <= high) sum += lVal.get(i);
        }
        return sum;
    }

    private TreeNode helperDFS(TreeNode root) {
        if (root == null) return null;

        if (root.left != null) root.left = helperDFS(root.left);
        if (root != null) lVal.add(root.val);

        if (root.right != null) root.right = helperDFS(root.right);
        return root;
    }

}
