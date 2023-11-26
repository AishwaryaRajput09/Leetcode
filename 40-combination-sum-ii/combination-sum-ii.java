class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int n = candidates.length;
        Arrays.sort(candidates);
        Sum2(candidates,res,ans,0,0,target,n);
        return res;
    }
    List<List<Integer>> Sum2(int[] arr,List<List<Integer>> res,List<Integer> ans,int sum,int i,int target,int n){
        if(sum == target){
            res.add(new ArrayList<>(ans));
            return res;
        }
        if(i==n|| sum>target){
            return res;
        }
        ans.add(arr[i]);
       
        Sum2(arr,res,ans, sum += arr[i],i+1,target,n);
        while (i < n - 1 && arr[i] == arr[i + 1]) {
            i++;
        }
        ans.remove(ans.size()-1);
        sum -= arr[i];
        Sum2(arr,res,ans,sum,i+1,target,n);

        return res;
    }
}