class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sol=new ArrayList<>();
        int n=candidates.length;
        backtrack(candidates,target,0,0,sol,res,n);
        return res;
    }
    private void backtrack(int[] nums,int target,int i,int cur_sum,List<Integer> sol,List<List<Integer>> res,int n){
        if(cur_sum==target){
            res.add(new ArrayList<>(sol));
            return;
        }
        if(cur_sum>target || i==n){
            return;
        }
        backtrack(nums,target,i+1,cur_sum,sol,res,n);
        sol.add(nums[i]);
        backtrack(nums,target,i,cur_sum+nums[i],sol,res,n);
        sol.remove(sol.size()-1);
    }
    
}