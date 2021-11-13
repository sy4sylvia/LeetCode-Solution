//1106
//257 Binary Tree Paths

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BTPath {
    //DFS

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new LinkedList<>();
        helper(root, "", l);
        return l;
    }

    private void helper(TreeNode root, String path, List<String> bTPaths) {
        //pre-order: root, left, right
        if (root != null) {
            path += String.valueOf(root.val);
            if (root.left == null && root.right == null) bTPaths.add(path);
            else {
                path += "->";
                if (root.left != null) helper(root.left, path, bTPaths);
                if (root.right != null) helper(root.right, path, bTPaths);
            }
        }
    }
 }
