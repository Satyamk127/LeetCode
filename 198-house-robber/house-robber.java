class Solution {
    int [] dp;
    public int maxMony(int [] arr , int i){
        if(i>=arr.length) return 0;
        if(dp[i]>=0) return dp[i];
        int pick = arr[i] + maxMony(arr,i+2);
        int sikp = maxMony(arr,i+1);
        return dp[i]=Math.max(pick,sikp);
    }
    public int rob(int[] nums) {
        int  n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return maxMony(nums,0);
        
    }
}