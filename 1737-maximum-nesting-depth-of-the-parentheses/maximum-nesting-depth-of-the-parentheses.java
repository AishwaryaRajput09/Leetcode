class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        if(s.length() == 0){
            return 0;
        }
        Stack<Character> st = new Stack<>();
        int cd = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch == '('){
                st.push('(');
                cd++;
               ans = Math.max(ans,cd);
            }else if(ch == ')'){
                cd--;
                st.pop();
            }
        }
        return ans;
    }
}