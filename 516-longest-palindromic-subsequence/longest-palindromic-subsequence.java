class Solution {
    static int[][] dp;
    public int LCS(int i, int j, StringBuilder s1, StringBuilder s2){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=1+LCS(i-1,j-1,s1,s2);
        else return dp[i][j]= Math.max(LCS(i-1,j,s1,s2),LCS(i,j-1,s1,s2));
    }
    public int lcs(StringBuilder s1, StringBuilder s2) {
        int  n = s1.length();
        int m = s2.length();
        dp = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return LCS(n-1,m-1,new StringBuilder(s1),new StringBuilder(s2));
        
    }



    public int longestPalindromeSubseq(String s) {
        StringBuilder a = new StringBuilder(s);
        StringBuilder b = new StringBuilder(s);
         b.reverse();
        return lcs(a,b);

        
    }
}