class Solution {
    public int tribonacci(int n) {
       ArrayList<Integer> temp = new ArrayList<>();
       temp.add(0);
       temp.add(1);
       temp.add(1);
        for(int i=3;i<n+1;++i){
           int var=temp.get(i-1)+temp.get(i-2)+temp.get(i-3);
           temp.add(var);
        }
        return temp.get(n);
    }
}
