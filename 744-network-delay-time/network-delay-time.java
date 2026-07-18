class Solution {

    class Pair implements Comparable<Pair> {
        int node;
        int time;

        Pair(int node, int time) {
            this.node = node;
            this.time = time;
        }

       
        public int compareTo(Pair p) {
            return this.time - p.time;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < times.length; i++) {
            int u = times[i][0];
            int v = times[i][1];
            int wt = times[i][2];

            adj.get(u).add(new Pair(v, wt));
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[k] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(k, 0));

        while (!pq.isEmpty()) {

            Pair cur = pq.poll();

            int node = cur.node;
            int time = cur.time;

            if (time > dist[node])
                continue;

            for (Pair next : adj.get(node)) {

                int newTime = time + next.time;

                if (newTime < dist[next.node]) {

                    dist[next.node] = newTime;
                    pq.add(new Pair(next.node, newTime));
                }
            }
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {

            if (dist[i] == Integer.MAX_VALUE)
                return -1;

            ans = Math.max(ans, dist[i]);
        }

        return ans;
    }
}