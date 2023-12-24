class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else{
                
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                }
                    else{
                        stack.push(ch);
                    }
            }

        }
        while(!stack.isEmpty()){
            count++;
            stack.pop();

        }
        return count;
    }
}