class Solution {
    static int dp[][];
    public int find(int i , int j, StringBuilder s1, StringBuilder s2){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return find(i-1,j-1, s1,s2);
        int replace = 1+find(i-1,j-1, s1,s2);
        int remove = 1+find(i-1,j, s1,s2);
        int insert = 1+find(i,j-1, s1,s2);
        return dp[i][j]=Math.min(replace,Math.min(remove,insert));
    }
    public int minDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;

            }
        }
        return find(n-1,m-1,new StringBuilder(s1), new StringBuilder(s2));
        
    }
}