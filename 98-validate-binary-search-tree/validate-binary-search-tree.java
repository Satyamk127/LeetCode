
class Solution {

    public boolean IsBst(TreeNode root, long start , long end){
        if(root==null) return true;

        if(root.val<=start || root.val>=end) return false;

        return IsBst(root.left,start,root.val)&& IsBst(root.right,root.val,end);
    }
    public boolean isValidBST(TreeNode root) {


        return IsBst(root,Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
}