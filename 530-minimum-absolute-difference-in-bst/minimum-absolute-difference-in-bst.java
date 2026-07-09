class Solution {

    TreeNode prev = null;
    int ans = Integer.MAX_VALUE;

    public void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);

        if (prev != null) {
            ans = Math.min(ans, root.val - prev.val);
        }

        prev = root;

        inorder(root.right);
    }

    public int getMinimumDifference(TreeNode root) {

        inorder(root);

        return ans;
    }
}