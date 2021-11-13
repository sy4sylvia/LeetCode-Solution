//501. Find Mode in Binary Search Tree
//1111

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FindModeInBST {

    //brute force using Hash Map, applicable for BTs.
//    HashMap<Integer, Integer> hm = new HashMap<>();
//    int max = 0;
//
//    public int[] findMode(TreeNode root) {
//        if (root == null) return new int[0];
//        helper(root);
//        List<Integer> l = new LinkedList<>();
//        for (int i : hm.keySet()) {
//            if (hm.get(i) == max) l.add(i);
//        }
//        int[] ans = new int[l.size()];
//        for (int i = 0; i < l.size(); i++) ans[i] = l.get(i);
//        return ans;
//    }
//
//    private void helper(TreeNode root) {
//        //in-order traversal
//        if (root.left != null) helper(root.left);
//        hm.put(root.val, hm.getOrDefault(root.val, 0) + 1);
//        if (max < hm.get(root.val)) max = hm.get(root.val);
//        if (root.right != null) helper(root.right);
//    }



    int count = 0;
    int maxCount = 0;
    TreeNode pre;
    List<Integer> l = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        inOrder(root);
        int[] ans = new int[l.size()];
        for (int i = 0; i < l.size(); i++) ans[i] = l.get(i);
        return ans;
    }

    //using properties of BST, in-order traversal
    private void inOrder(TreeNode root) {
        if (root == null) return;

        if (root.left != null) inOrder(root.left);

        //when at root:
        if (pre != null && pre.val == root.val) count++;
        else count = 1;
        pre = root;
       //update count
        if (count > maxCount) {
            maxCount = count;
            l = new ArrayList<>();
            l.add(root.val);
        }
        else if (count == maxCount) l.add(root.val);

        if (root.right != null) inOrder(root.right);
    }
}
