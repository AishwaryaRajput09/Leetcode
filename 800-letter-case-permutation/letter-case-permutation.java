class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        helper(s,"", result);
        return result;
    }
    public void helper(String input, String output,List<String> result){
        if(input.length() == 0){
            result.add(output);
            return;
        }
        char ch = input.charAt(0);
        input = input.substring(1);
        if(Character.isDigit(ch)){
            helper(input, output + ch,result);
        }else{
            helper(input, output + Character.toLowerCase(ch),result);
            helper(input, output + Character.toUpperCase(ch),result);
        }
    }
}