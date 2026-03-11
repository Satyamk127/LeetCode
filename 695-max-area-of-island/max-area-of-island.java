class Solution {
    public int dfs(int [][] grid ,int i,int j){
       if(i<0 || j<0 || i>=grid.length ||j>=grid[0].length || grid[i][j]==0) return 0 ;

       grid[i][j]=0;
       int a = dfs(grid,i-1,j);
       int b = dfs(grid,i+1,j);
       int c = dfs(grid,i,j-1);
       int d = dfs(grid,i,j+1);
       return a+b+c+d+1;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxval =0;
        int m= grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int max = dfs(grid,i,j);
                    if(max>maxval){
                        maxval=max;
                    }
                }
            }
        }
        return maxval;
        
    }
}