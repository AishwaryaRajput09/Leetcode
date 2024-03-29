class Solution {
    public int maxLength(List<String> arr) {
        List<Integer> dp = new ArrayList<>();
        dp.add(0);
        int ans = 0;
        for (String s : arr) {
            int a = 0, dupl = 0;
            for (char c : s.toCharArray()) {
                dupl |= a & (1 << (c - 'a'));
                a |= 1 << (c - 'a');
            }
            if (dupl > 0) continue;
                
            for(int i = dp.size() - 1; i >= 0; i--) {
                if ((dp.get(i) & a) > 0) continue;
                dp.add(dp.get(i) | a);
                ans = Math.max(ans, Integer.bitCount(dp.get(i) | a));
            }
            
        }
        return ans;
    }
}