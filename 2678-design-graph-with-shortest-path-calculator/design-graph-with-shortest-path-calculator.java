import java.util.*;

class Graph {
    private int n;
    private Map<Integer, List<int[]>> adjList;

    public Graph(int n, int[][] edges) {
        this.n = n;
        this.adjList = new HashMap<>();

        for (int[] edge : edges) {
            adjList.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(new int[]{edge[1], edge[2]});
        }
    }

    public void addEdge(int[] edge) {
        adjList.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(new int[]{edge[1], edge[2]});
    }

    public int shortestPath(int node1, int node2) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[node1] = 0;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        minHeap.offer(new int[]{node1, 0});

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int currentNode = current[0];
            int currentDist = current[1];

            if (currentDist > dist[currentNode]) {
                continue;
            }

            for (int[] neighbor : adjList.getOrDefault(currentNode, Collections.emptyList())) {
                int nextNode = neighbor[0];
                int edgeCost = neighbor[1];
                int newDist = currentDist + edgeCost;

                if (newDist < dist[nextNode]) {
                    dist[nextNode] = newDist;
                    minHeap.offer(new int[]{nextNode, newDist});
                }
            }
        }

        return dist[node2] == Integer.MAX_VALUE ? -1 : dist[node2];
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
