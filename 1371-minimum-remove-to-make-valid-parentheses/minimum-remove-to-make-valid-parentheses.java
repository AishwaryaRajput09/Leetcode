class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < sb.length(); ++i){
            if(sb.charAt(i) == '('){
                st.push(i);
            }else if(sb.charAt(i) == ')'){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    sb.setCharAt(i,'*');
                }
            }
        }
        while(!st.isEmpty()){
           sb.setCharAt(st.pop(),'*');
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < sb.length(); ++i){
            if(sb.charAt(i) != '*'){
                res.append(sb.charAt(i));
            }
        }
        return res.toString();
    }
}