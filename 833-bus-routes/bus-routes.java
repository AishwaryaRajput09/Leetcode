import java.util.*;

class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0; // Already at the destination
        }

        Map<Integer, List<Integer>> stopToRoutes = new HashMap<>();
        Set<Integer> visitedStops = new HashSet<>();
        Set<Integer> visitedRoutes = new HashSet<>();

        for (int i = 0; i < routes.length; i++) {
            for (int stop : routes[i]) {
                stopToRoutes.computeIfAbsent(stop, k -> new ArrayList<>()).add(i);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visitedStops.add(source);

        int numBuses = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int currentStop = queue.poll();
                List<Integer> currentRoutes = stopToRoutes.get(currentStop);

                for (int route : currentRoutes) {
                    if (visitedRoutes.contains(route)) {
                        continue;
                    }

                    visitedRoutes.add(route);

                    for (int nextStop : routes[route]) {
                        if (visitedStops.contains(nextStop)) {
                            continue;
                        }

                        visitedStops.add(nextStop);
                        queue.offer(nextStop);

                        if (nextStop == target) {
                            return numBuses + 1;
                        }
                    }
                }
            }

            numBuses++;
        }

        return -1; // No route found
    }
}
