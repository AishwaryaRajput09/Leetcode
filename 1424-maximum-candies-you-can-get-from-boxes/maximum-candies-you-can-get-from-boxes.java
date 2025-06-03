class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int s = status.length;
        int cand = 0;
        boolean[] hasBox = new boolean[s];
        boolean[] used = new boolean[s];
        for (int k : initialBoxes) {
            hasBox[k] = true;
        }
        boolean found = true;
        while (found) {
            found = false;
            for (int i = 0; i < s; i++) {
                if (hasBox[i] && status[i] == 1 && !used[i]) {
                    used[i] = true;
                    cand += candies[i];
                    found = true;
                    for (int k = 0; k < keys[i].length; k++) {
                        status[keys[i][k]] = 1;
                    }
                    for (int j = 0; j < containedBoxes[i].length; j++) {
                        hasBox[containedBoxes[i][j]] = true;
                    }
                }
            }
        }
        return cand;
    }
}