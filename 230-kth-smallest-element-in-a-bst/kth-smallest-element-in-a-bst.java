
class Solution {

     public void inverseOrder(TreeNode root, int k, int [] res, int [] cout ){
        if(root==null || cout[0]>=k){
            return ;
        }
        inverseOrder(root.left, k,res,cout);
        cout[0]++;
        if(cout[0]==k){
            res[0] = root.val;
            return ;
        }
        inverseOrder(root.right, k,res,cout);
        
        
    }
    public int kthSmallest(TreeNode root, int k) {

        int [] result = {-1};  // index o per -i initialaized kiya hai 
        int [] count = {0};
        
        inverseOrder(root, k, result, count);
        return result[0];
        
    }
}