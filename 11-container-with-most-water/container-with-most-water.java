class Solution {
    public int maxArea(int[] height) {
       //brute force approach(n^2)
       int maxWater = 0;
    //    for(int i = 0; i < height.length; i++){
    //     for(int j = i + 1; j < height.length; j++){
    //         maxWater = Math.max(maxWater, (j - i) * Math.min(height[i], height[j]));
    //     }
    //    } 
    //Two pointers (optimal)
    int left = 0; 
    int right = height.length - 1;
    while(left < right){
        maxWater = Math.max(maxWater, (right - left) * Math.min(height[left], height[right]));
        if(height[left] > height[right]){
            right--;
        }else{
            left++;
        }
    }

       return maxWater;
    }
}