class Solution {
    public void bfs(int [][] arr, int i,int j){
        arr[i][j]=-1;
        // left
        if(j-1>0 && arr[i][j-1]==1){
            bfs(arr,i,j-1);

        }
        if(i-1>0 && arr[i-1][j]==1){
            bfs(arr,i-1,j);
        }
        if(i+1<arr.length && arr[i+1][j]==1){
            bfs(arr,i+1,j);
        }
        if(j+1<arr[0].length && arr[i][j+1]==1){
            bfs(arr,i,j+1);
        }

    }
    public int numEnclaves(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || i == m-1 || j == 0 || j == n-1){
                    if(arr[i][j]==1){
                        bfs(arr, i,j);
                    }
                    

                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
        }
        return count;
        
    }
}