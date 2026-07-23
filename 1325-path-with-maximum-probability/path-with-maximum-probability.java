class Solution {
    
    class Pair implements Comparable<Pair> {
        int node;
        double time;
        Pair(int node,double time){
            this.node=node;
            this.time=time;
        }
        public int compareTo(Pair p){
            
            return Double.compare(this.time,p.time);
        }
    }
    public double maxProbability(int n, int[][] edges, double[] suc, int start, int end) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v=edges[i][1];
            double time = suc[i];
            adj.get(u).add(new Pair(v,time));
            adj.get(v).add(new Pair(u,time));
        }
        double [] time = new double[n];
        time[start]=1;
        

        PriorityQueue<Pair> q = new PriorityQueue<>(Collections.reverseOrder());

        q.add(new Pair(start,1));
        while(q.size()>0){
            Pair top = q.remove();
            if(top.time <time[top.node]) continue;
            for(Pair p : adj.get(top.node)){
                double total= p.time*top.time;
                if(total>time[p.node]){
                    time[p.node] =total;
                    q.add(new Pair(p.node,total));
                }
            }
        }
        return time[end];

        
    } 
}