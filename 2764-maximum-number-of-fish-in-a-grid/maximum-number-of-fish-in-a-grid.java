class Solution {
     int count=0;
    public int dfs(int[][] arr, int i, int j){
        count+=arr[i][j];
        arr[i][j]=0;
        if(i>0 && arr[i-1][j]!=0){
            dfs(arr,i-1,j);

        }
         if(i<arr.length-1 && arr[i+1][j]!=0){
            dfs(arr,i+1,j);
            
        }
        if(j>0 && arr[i][j-1]!=0){
            dfs(arr,i,j-1);

        }
        if(j<arr[0].length-1 && arr[i][j+1]!=0){
            dfs(arr,i,j+1);

        }
        return count;

    
        
    
    }
    public int findMaxFish(int[][] grid) {
        int Maxval=0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    count=0;
                    int max = dfs(grid,i,j);
                    if(max>Maxval){
                        Maxval=max;
                    }

                }
            }
        }
        return Maxval;
        
    }
}