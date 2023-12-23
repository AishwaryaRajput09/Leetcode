class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y =0;

        Set<String> map = new HashSet<>();
        map.add("0,0");
        for(int i = 0; i < path.length();i++){
            if(path.charAt(i)== 'N'){
                y += 1;
            }else if(path.charAt(i)=='S'){
                y -= 1;
            }else if(path.charAt(i)=='E'){
                x += 1;
            }else if(path.charAt(i)=='W'){
                x -= 1;
            }
            String curr = x + "," + y;

            if(map.contains(curr)){
                return true;
            }
            map.add(curr);
        }
        return false;
    }
}