class Solution {
    static int dp[];
     public static int MinCost(int [] arr, int i){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = arr[i]+MinCost(arr,i+1);
        int push = arr[i]+MinCost(arr,i+2);
        return dp[i] = Math.min(pick,push);
        
    }
    public int minCostClimbingStairs(int[] arr) {
        int n = arr.length;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return Math.min(MinCost(arr,0),MinCost(arr,1));
        
    }
}