public class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<int[]>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] flight : flights) {
            adj[flight[0]].add(new int[]{flight[1], flight[2]});
        }

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, src, 0});

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        while (!q.isEmpty()) {
            int[] it = q.poll();
            int stops = it[0];
            int node = it[1];
            int cost = it[2];

            if (stops > k) continue;

            for (int[] iter : adj[node]) {
                int adjNode = iter[0];
                int edN = iter[1];

                if (cost + edN < dist[adjNode] && stops <= k) {
                    dist[adjNode] = cost + edN;
                    q.offer(new int[]{stops + 1, adjNode, cost + edN});
                }
            }
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}
