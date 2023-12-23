class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y =0;

        Set<String> visited = new HashSet<>();
        visited.add("0,0");
        for(char ch : path.toCharArray()){
            switch(ch){
                case 'N':
                y++;
                break;
                case 'S':
                y--;
                break;
                case 'E':
                x++;
                break;
                case 'W':
                x--;
                break;
            }
            
            String curr = x + "," + y;

            if(visited.contains(curr)){
                return true;
            }
            visited.add(curr);
        }
        return false;
    }
}