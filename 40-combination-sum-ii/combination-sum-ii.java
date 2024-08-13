class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int n = candidates.length;
        Arrays.sort(candidates);
        sumComb2(result,ans,0,0,target,candidates,n);
        return result;

    }
    public List<List<Integer>> sumComb2(List<List<Integer>> result,List<Integer> ans,int i, int sum,int target,int[] arr,int n){
            if(sum == target){
                result.add(new ArrayList<>(ans));
                return result;
            }
            if(i == n || sum > target){
                return result;
            }
            ans.add(arr[i]);
            sumComb2(result,ans,i+1,sum+= arr[i],target,arr,n);
            while(i < n - 1 && arr[i] == arr[i+1] ){
                i++;
            }
            ans.remove(ans.size()-1);
            sum -= arr[i];
            sumComb2(result,ans,i+1,sum,target,arr,n);
            return result;
    }
}