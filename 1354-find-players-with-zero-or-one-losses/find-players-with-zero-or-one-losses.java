class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> winners = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> win = new ArrayList<>();
        Set<Integer> uniquePlayers = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> secondColumnValues = new HashSet<>();

        for (int[] m : matches) {
            int player1 = m[0];
            int player2 = m[1];

            uniquePlayers.add(player1);
            secondColumnValues.add(player2);

            map.put(player2, map.getOrDefault(player2, 0) + 1);
        }

        for (int player : secondColumnValues) {
            if (map.get(player) == 1) {
                one.add(player);
            }
        }

        for (int[] m : matches) {
            int player1 = m[0];
            int player2 = m[1];

            if (secondColumnValues.contains(player1)) {
                uniquePlayers.remove(player1);
            }
        }

        win.addAll(uniquePlayers);

        Collections.sort(one);
        Collections.sort(win);

        winners.add(win);
        winners.add(one);

        return winners;
    }
}