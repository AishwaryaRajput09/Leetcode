class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Naive Approach, It dosen't work for all the test cases TLE -_-
        // Okay, But what next ? I did what could do.gotta go to youtube <_^_>  
        // int result[] = new int[nums.length - k + 1];
        // int e = 0;
        // int j = 0;
        // while(j <= nums.length - k){
        // int max = Integer.MIN_VALUE;
        //     for(int i = j; i < j + k; i++){
        //         max = Math.max(max,nums[i]);
        //     }
        //     result[e++] = max;
            
        //     j++;
        // }
        // return result; 
        // Ta Da! Optimization 
        // after watching a youtube video I figured out i will need to use the deque for storing the max and after element so I dont miss element which are present in middle of i and j + k window;
        // Initialization 
        Deque<Integer> deque = new ArrayDeque<>();
        int res[] = new int[nums.length - k + 1];
        int i = 0, j = 0, e = 0;
        while(j < nums.length){
                
           while(!deque.isEmpty() && deque.peekLast() < nums[j]){
                deque.pollLast();
                 }

                deque.addLast(nums[j]);
                
                if(j - i + 1 < k){
                 j++;
                    
                }else if(j - i + 1 == k){
                    res[e++] = deque.peekFirst();
                
                 if(nums[i] == deque.peekFirst()){
                    deque.pollFirst();
                    // max  = deque.peekFirst();
                }
                i++;
            j++;
            }
        }
        return res;
    }
}