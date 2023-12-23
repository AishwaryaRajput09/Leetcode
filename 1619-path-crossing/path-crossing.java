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
            
            String cordinates=getCordinates(x,y);

            if(visited.contains(cordinates)){
                return true;
            }
            visited.add(cordinates);
        }
        return false;
    }
   private String getCordinates(int x , int y){
       StringBuilder s = new StringBuilder();
       s.append(x);
       s.append(",");
       s.append(y);
       return s.toString();
    }
}