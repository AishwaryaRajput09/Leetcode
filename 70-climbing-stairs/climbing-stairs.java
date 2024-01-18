class Solution {
    public int climbStairs(int n) {
        
        // return step;
        Map<Integer, Integer> map = new HashMap<>();
        return steps(n,0,n,map);
    }
    int steps(int n, int step,int i,Map<Integer, Integer> map){
        if(n==0){
            return step+1;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int way1 = steps(n-1,step,i-1,map);
        int way2 = (i >= 2) ?steps(n - 2, step, i - 2,map):0;

        int total =  way1+way2;
        map.put(n,total);
        return total;
        
    }
    
}