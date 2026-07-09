class Solution {

    int idx = 0;

    public int find(TreeNode root){
        if(root==null) return 0;
        return 1 + find(root.left) + find(root.right);
    }

    public void inorder(TreeNode root, int[] arr){
        if(root==null) return;

        inorder(root.left, arr);
        arr[idx++] = root.val;
        inorder(root.right, arr);
    }

    public int getMinimumDifference(TreeNode root) {

        int n = find(root);

        int[] arr = new int[n];

        inorder(root, arr);

        int ans = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            ans = Math.min(ans, arr[i]-arr[i-1]);
        }

        return ans;
    }
}