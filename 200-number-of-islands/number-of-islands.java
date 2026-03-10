class Solution {
    public void dfs(char [][] arr, int i,int j){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]!='1') return;
        arr[i][j]='2';

        dfs(arr,i-1,j);
        dfs(arr,i+1,j);
        dfs(arr,i,j-1);
        dfs(arr,i,j+1);
    }
    public int numIslands(char[][] grid) {

        int count =0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }

            }
        }
        return count;
        
    }
}