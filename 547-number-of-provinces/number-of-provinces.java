class Solution {
    public void bfs(int[][] arr ,int i,boolean[] vis){
        vis[i]=true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front = q.remove();
            for(int j=0;j<arr.length;j++){
                if(arr[front][j]==1 && vis[j]==false){
                    q.add(j);
                    vis[j]=true;
                }
            }
        }
    }

    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        boolean [] vis = new boolean[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(vis[i]==false){
                bfs(adj, i, vis);
                count++;

            }
        }
        return count;
        
    }
}