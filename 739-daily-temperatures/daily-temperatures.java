class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int arr[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n ; i++){
            while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int ind = stack.pop();
                arr[ind] = i - ind;
            }
            stack.push(i);
        }
      return arr;  
    }
}