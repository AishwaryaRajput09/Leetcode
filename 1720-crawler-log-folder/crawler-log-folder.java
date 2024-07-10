
class Solution {
    public int minOperations(String[] logs) {
        // String patS ="^[a-z]+\\d+/$";
        // String patS2 = "../";
        // Stack<String> st = new Stack<>();
        // for(int i = 0; i < logs.length; i++){
        //     if(logs[i].matches(patS)){
        //         st.push(logs[i]);
        //     }else if(logs[i].matches(patS2)){
        //         if(!st.isEmpty()){
        //         st.pop();
        //         }
        //         System.out.println(st); 
        //     }else if(logs[i].matches("1/")){
        //         st.push(logs[i]);
        //     }
        // }
                
        // return st.size();
        int steps = 0;
        for(String s: logs){
            if(s.equals("../")){
                    System.out.println(0);
                if(steps == 0){
                    continue;
                    }
                else {
                    steps--;
                }
            }else if(s.equals("./")){
                continue;
            }else{
                steps++;
            }
        }
        return steps;
    } 
}