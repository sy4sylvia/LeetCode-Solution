//1115
//450 Delete Node in a BST
public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        return helperDelete(root, key);
    }

    private TreeNode helperDelete(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.val) root.left = helperDelete(root.left, key);
        else if (key > root.val) root.right = helperDelete(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            //root.left != null && root.right = null
            //find min in right subtree
            TreeNode tmp = root.right;
            while (tmp.left != null) tmp = tmp.left;
            root.val = tmp.val;
            root.right = helperDelete(root.right, tmp.val); //recursively delete min val in the right subtree
        }

        return root;
    }
}
