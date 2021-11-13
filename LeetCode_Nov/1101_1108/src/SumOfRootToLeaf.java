//1106
//1022 Sum of Root To Leaf Binary Numbers

import java.util.LinkedList;
import java.util.List;

public class SumOfRootToLeaf {
//    public int sumRootToLeaf(TreeNode root) {
//        List<String> l = new LinkedList<>();
//        helpFindPath(root, "", l);
//
//        int sum = 0;
//        for (int i = 0; i < l.size(); i++) sum += Integer.parseInt(l.get(i), 2);
//        return sum;
//    }
//
//    private void helpFindPath(TreeNode root, String path, List<String> l) {
//        if (root != null) {
//            path += String.valueOf(root.val);
//            if (root.left == null && root.right == null) l.add(path);
//            else {
//                if (root.left != null) helpFindPath(root.left, path, l);
//                if (root.right != null) helpFindPath(root.right, path, l);
//            }
//        }
//    }

    //DFS bit manipulation

    int res = 0;
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        else {
            helper(root, 0);
            return res;
        }
    }

    private void helper(TreeNode root, int previousSum) {
        if (root != null) previousSum += previousSum * 2 + root.val;
        if (root.left == null && root.right == null) res = previousSum;
        if (root.left != null) helper(root.left, previousSum);
        if (root.right != null) helper(root.right, previousSum);
    }
}
