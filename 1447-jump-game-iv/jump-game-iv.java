class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        HashMap<Integer, List<Integer>> lookUp = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            lookUp.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        int steps = 0;
        q.add(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                int curr = q.poll();

                int left = curr - 1;
                int right = curr + 1;
                if (curr == n - 1)
                    return steps;
                if (left >= 0 && !visited[left]) {
                    q.add(left);
                    visited[left] = true;
                }
                if (right < n && !visited[right]) {
                    q.add(right);
                    visited[right] = true;
                }
                if(lookUp.containsKey(arr[curr])){
                    for(int ind: lookUp.get(arr[curr])){
                        // map.get(arr[curr]).add();
                        if(!visited[ind]) {
                            q.add(ind);
                            visited[ind] = true;
                        }
                    }
                }
                lookUp.remove(arr[curr]);
                size--;
            }
            steps++;
        }
        return -1;

    }
}