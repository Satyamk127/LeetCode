class Solution {
    public void bfs(int [][] arr,int i,boolean [] ans){
        int n= arr.length;
        ans[i]=true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front=q.poll();
            for(int j=0;j<n;j++){
                if(arr[front][j]==1 && ans[j]==false){
                    ans[j]=true;
                    q.add(j);
                }
            }
        }
    }
    public int findCircleNum(int[][] ans) {
        int n= ans.length;
        int count=0;
        boolean [] arr = new boolean[n];
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                bfs(ans,i,arr);
                count++;

            }
        }
        return count;
        
    }
}