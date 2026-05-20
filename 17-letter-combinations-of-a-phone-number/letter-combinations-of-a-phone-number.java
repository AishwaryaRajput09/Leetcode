class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        if(digits.length() == 0){
            return res;
        } 
        StringBuilder op = new StringBuilder();
        combinations(digits, res, op, 0, map);
        return res;

    }

    public void combinations(String digits, List<String> res, StringBuilder op, int ind, HashMap<Character, String> map) {
        if (ind == digits.length()) {
            res.add(op.toString());
            return;
        }
        char digit = digits.charAt(ind);
        // digits = digits.substring(1);
        if(map.containsKey(digit)){
            String ip = map.get(digit);
            for(int i = 0; i < ip.length(); i++){
                op.append(ip.charAt(i));
                // ip = ip.substring(1);
                combinations(digits, res, op, ind+1, map);
                op.deleteCharAt(op.length()-1);
            }
        }
    }
}