class Solution {
    public int maxScore(String s) {
    //     int max = 0;
    //     for(int i = 0; i<s.length();i++){
    //          int count = 0;
    //         String left = s.substring(0,i+1);
    //         String right = s.substring(i+1);
    //         if(!left.isEmpty()&& !right.isEmpty()){

    //     count = countZero(left) + countOnes(right);
    //         }

    //     max = Math.max(max,count);

    //     }
    //     return max;
    // }
    // private int countZero(String s){
    //     int count = 0; 
    //     for(char ch : s.toCharArray()){
    //         if(ch == '0'){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // private int countOnes(String s){
    //     int count = 0; 
    //     for(char ch : s.toCharArray()){
    //         if(ch == '1'){
    //             count++;
    //         }
    //     }
    //     return count;
    int left =0;
    int right = 0;
    int score = 0;

    for(char ch : s.toCharArray()){
        if(ch == '1'){
            right++;
        }
    }
    for(int i = 0; i < s.length()-1;i++){
        if(s.charAt(i)=='0'){
            left++;
        }else{
            right--;

        }
            score = Math.max(score,left+right);
    }
        return score;
    }

}