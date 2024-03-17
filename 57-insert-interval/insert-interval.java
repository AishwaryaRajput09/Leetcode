class Solution {
    public int[][] insert(int[][] in, int[] newI) {
         List<int[]> merInt = new ArrayList<>();
         int i = 0;
    while(i < in.length && in[i][1] < newI[0]){
        merInt.add(in[i]);
        i++;
    }
    while(i < in.length && in[i][0] <= newI[1]){
        newI[0] = Math.min(newI[0], in[i][0]);
        newI[1] = Math.max(newI[1], in[i][1]);
        i++;
    }
    merInt.add(newI);
    while( i < in.length){
        merInt.add(in[i]);
        i++;
    }
    int[][] res = new int[merInt.size()][2];
    for(int j = 0; j < merInt.size(); j++){
        res[j] = merInt.get(j);
    }
    return res;
    }
}