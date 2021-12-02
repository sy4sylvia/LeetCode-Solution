//1121
//450 Delete Node in a BST

public class DeleteInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;

        if (key < root.val) root.left = deleteNode(root.left, key);
        else if (key > root.val) root.right = deleteNode(root.right, key);
        else {
            if (root.left == null && root.right == null) return null;
            if (root.left != null & root.right == null) return root.left;
            if (root.left == null && root.right != null) return root.right;

            TreeNode tmp = root.right;
            while (tmp.left != null) tmp = tmp.left;
            root.val = tmp.val;
            root.right = deleteNode(root.right, tmp.val);

        }
        return root;
    }
}
