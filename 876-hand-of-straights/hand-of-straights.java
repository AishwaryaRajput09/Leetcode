class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
         HashMap<Integer, Integer> map = new HashMap<>();
        
        if (hand.length % groupSize != 0) {
            return false;
        }

        for (int card : hand) {
            if (map.containsKey(card)) {
                map.put(card, map.get(card) + 1);
            } else {
                map.put(card, 1);
            }
        }

        Arrays.sort(hand);

        for (int card : hand) {
            if (!map.containsKey(card) || map.get(card) == 0) {
                continue;
            }

            for (int j = 0; j < groupSize; j++) {
                int current = card + j;
                if (!map.containsKey(current) || map.get(current) == 0) {
                    return false;
                }
                map.put(current, map.get(current) - 1);
                if (map.get(current) == 0) {
                    map.remove(current);
                }
            }
        }

        return true;
    }
}