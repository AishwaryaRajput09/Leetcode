class Solution {
    public int furthestBuilding(int[] h, int br, int l) {
        // int i = 0;
        int n = h.length;
        PriorityQueue<Integer> ladderUsed = new PriorityQueue<>((a, b) -> b - a);
        int i = 0,diff=0;
        for (i = 0; i < n - 1; i++) {
            int curr = h[i];
            int next = h[i + 1];
             diff = next - curr;

            if (diff <= 0) {
                continue;
            }
            br = br - diff;
            ladderUsed.offer(diff);
            if(br < 0){
                br += ladderUsed.poll();
                l--;
            }
            if (l < 0){
                break;
            }
            }
        

        return i;
    }
}
