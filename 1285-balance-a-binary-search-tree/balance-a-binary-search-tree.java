
class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> ans){
        if(root==null ) return ;
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right,ans);

    }
    public TreeNode BinaryTree( int start, int end, ArrayList<Integer> ans){
        if(start>end) return null;

        int mid = (start+end)/2;
        TreeNode root = new TreeNode(ans.get(mid));
        root.left=BinaryTree(start,mid-1,ans);
        root.right=BinaryTree(mid+1,end,ans);
        return root;

    }
    public TreeNode balanceBST(TreeNode root) {
        if(root==null) return null;

        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        return BinaryTree(0,ans.size()-1,ans);
        
    }
}