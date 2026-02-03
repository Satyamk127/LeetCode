class Solution {
    static int dp[];
    
    private static int fibonachi(int n) {
		if(n<=1) return  n;
		if(dp[n]!=0) return dp[n];
		return dp[n]= fibonachi(n-1)+fibonachi(n-2);
		
	}
    public int fib(int n) {
         dp = new int[n+1];
		return  fibonachi(n);
    }
}