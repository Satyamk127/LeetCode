class Solution {
    public int[] findOrder(int n, int[][] arr) {
        int [] ans = new int[n];
        ArrayList<ArrayList<Integer>> app = new ArrayList<>();
        for(int i=0;i<n;i++){
            app.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            int a = arr[i][0];
            int b = arr[i][1];
            app.get(b).add(a);
            ans[a]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(ans[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        while(q.size()>0){
            int front= q.poll();
            temp.add(front);
            for(int e:app.get(front)){
                ans[e]--;
                if(ans[e]==0){
                    q.add(e);
                }
            }
            
        }
        if(n!=temp.size()) return new int[0];

        int [] ok = new int[n];
        for(int i=0;i<n;i++){
            ok[i]=temp.get(i);
        }
        return ok;

        
    }
}