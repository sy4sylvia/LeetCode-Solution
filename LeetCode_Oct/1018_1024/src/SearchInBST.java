//1021
//700 Search in a Binary Search Tree

public class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || val == root.val) return root;
        //consider the scenario where the tree is empty
        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

    public static void main(String[] args) {
        SearchInBST sibst = new SearchInBST();
//        TreeNode root = {4,2,7,1,3};
//        int val = 2;

    }
}
