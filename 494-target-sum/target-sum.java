class Solution {
    public int find(int i,int [] arr, int tar){
        if(i==arr.length){
            if(tar==0) return 1;
            else return 0;
        }
        int add = find(i+1,arr,tar-arr[i]);
        int sub = find(i+1,arr, tar+arr[i]);
        return add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return find(0,nums,target);
        
    }
}