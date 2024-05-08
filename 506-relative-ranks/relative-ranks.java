class Solution {
    public String[] findRelativeRanks(int[] score) {
        String [] result = new String[score.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < score.length;i++){
            map.put(score[i],i);
        }
        Arrays.sort(score);
        for(int i = score.length -1 ; i >= 0; i--){
            int index = map.get(score[i]);
            if(i == score.length-1){
                result[index] = "Gold Medal"; 
            }
            else if(i == score.length-2){
                result[index] = "Silver Medal"; 
            }
            else if(i == score.length-3){
                result[index] = "Bronze Medal"; 
            }else{
                result[index] = Integer.toString(score.length - i);
            }
        }
        return result;
        }
}