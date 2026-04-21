
class Solution {

    public int height(TreeNode root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return 1+Math.max(left, right);

    }

    public void LevelOrder(TreeNode root,int i, List<Integer> p, boolean leftToright ){
        if(root==null) return ;

        if(i==1){
            p.add(root.val);

        }else{
            if(leftToright){
                LevelOrder(root.left, i-1,p,leftToright);
                LevelOrder(root.right, i-1,p,leftToright);
            }else{
                LevelOrder(root.right, i-1,p,leftToright);
                LevelOrder(root.left, i-1,p,leftToright);
                

            }
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int h =height(root);
        List<List<Integer>> ans = new ArrayList<>();
        boolean leftToright=true;
        for(int i=1;i<=h;i++){
            List<Integer> lev = new ArrayList<>();
            LevelOrder(root, i, lev,leftToright);
            ans.add(lev);
            leftToright=!leftToright;

        
        }
        
        return ans;
    }
}