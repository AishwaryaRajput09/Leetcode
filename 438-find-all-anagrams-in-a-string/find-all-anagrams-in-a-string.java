class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : p.toCharArray()) {
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
        }

        int cnt = freq.size();
        int k = p.length();
        int len = s.length();
        int i = 0;
        int j = 0;
        while (j < len) {
            char c = s.charAt(j);
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) - 1);
                if (freq.get(c) == 0) {
                    // map.remove(c);
                    cnt--;
                }

            } 
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (cnt == 0)
                    res.add(i);
                char ch = s.charAt(i);
                if (freq.containsKey(ch)) {
                    freq.put(ch, freq.get(ch) + 1);
                    if (freq.get(ch) == 1) {
                        cnt++;
                    }
                }
                i++;
        j++;
            }
        
        }
        return res;
    }

}