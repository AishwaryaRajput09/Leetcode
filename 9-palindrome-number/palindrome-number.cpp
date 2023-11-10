class Solution {
public:
    bool isPalindrome(int x) {
       long long int sum = 0;
        int original = x;
        while(x > 0){
            int rem = x % 10;
            sum = sum * 10 + rem;
            x = x / 10;
        }
        if(sum == original){
           return true;
        }else{
            return false;
        }
        
    }
};