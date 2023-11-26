class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int n = candidates.length;
        Sum(candidates,target,res,ans,0,0,n);
        
        return res;
    }
     List<List<Integer>> Sum(int[] arr, int target,List<List<Integer>> res,List<Integer> ans,int i,int sum,int n) {
        if(sum == target){
            res.add(new ArrayList<>(ans));
            return res;
        }
        if(i==n|| sum> target){
            return res;
        }
        ans.add(arr[i]);
        sum +=arr[i];
        
            Sum(arr,target,res,ans,i,sum,n);
        
            ans.remove(ans.size()-1);
            sum -= arr[i];

        
            Sum(arr,target,res,ans,i+1,sum,n);
            // ans.remove(ans.size()-1);
        
       
       
        return res;
    }
    
}