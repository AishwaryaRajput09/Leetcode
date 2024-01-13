class Solution {
    public int minSteps(String s, String t) {
         int cnt = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            int countInS = map.getOrDefault(c, 0);
            if (countInS > 0) {
                map.put(c, countInS - 1);
            } else {
                cnt++;
            }
        }

        return cnt;
    }
}