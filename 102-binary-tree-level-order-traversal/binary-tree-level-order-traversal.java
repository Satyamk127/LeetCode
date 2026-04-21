
class Solution {
    public int HightOfBinary(TreeNode root){
        if(root==null) return 0;
        int left = HightOfBinary(root.left);
        int right = HightOfBinary(root.right);
        return 1+Math.max(left, right);
    }
    public void levelOrder(TreeNode root, int level,List<List<Integer>> ans ){
        if(root==null) return ;
         if(level == 0){
            ans.get(ans.size() - 1).add(root.val);
        } else {
            levelOrder(root.left, level - 1, ans);
            levelOrder(root.right, level - 1, ans);
        }
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        
        int height =HightOfBinary(root);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<height;i++){
             ans.add(new ArrayList<>());
            levelOrder(root, i, ans);
        }
        return ans;
        

        
    }
}