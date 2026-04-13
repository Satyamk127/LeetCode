class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
 
        int n = nums.length;
        int min = Integer.MAX_VALUE;
      
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                
                int p = Math.abs(i-start);
                if(p<min){
                    min=p;
                }
                 
            }
        }
        return min;
       
        
    }
}