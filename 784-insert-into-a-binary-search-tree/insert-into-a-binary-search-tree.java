
class Solution {
    public TreeNode Insertion(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }
        else if(root.val<val){
            root.right=Insertion(root.right,val);
        }
        else if(root.val>val){
            root.left=Insertion(root.left,val);
        }
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
       
        return Insertion(root,val);
        
    }
}