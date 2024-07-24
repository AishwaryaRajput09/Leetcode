class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }

    numList.sort((a,b)->{
        int freqA = map.get(a);
        int freqB = map.get(b);
        if(freqA != freqB){
            return freqA - freqB;
        }else{
            return b - a;
        }
    });
    for (int i = 0; i < nums.length; i++) {
            nums[i] = numList.get(i);
        }
   return nums;
    }
}