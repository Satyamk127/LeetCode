class Solution {
    public int islandPerimeter(int[][] grid) {
        int parameter=0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    parameter+=4;

                    // top chack karuga 
                    if(i>0 && grid[i-1][j]==1){
                        parameter-=2;
                    }
                    // left chack karuga 
                    if(j>0 && grid[i][j-1]==1){
                        parameter-=2;
                    }
                }
            }
        }
        return parameter;
        
    }
}