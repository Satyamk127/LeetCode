class Solution {
    public List<Integer> eventualSafeNodes(int[][] arr) {
         int n = arr.length;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        
       
        int [] ind = new int[n];
        for(int i=0;i<n;i++){
            for(int e : arr[i]){
                adj.get(e).add(i);
                ind[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();

        while(q.size()>0){
            int front = q.poll();
            ans.add(front);
            for(int e :adj.get(front)){
                ind[e]--;
                if(ind[e]==0){
                    q.add(e);
                }
            }
        }

        Collections.sort(ans);
        return ans;
        
    }
}