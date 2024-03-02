// // class Solution {
// //     public List<List<Integer>> subsets(int[] nums) {
// //         int n=nums.length;
// //         List<List<Integer>> ans=new ArrayList<>(); 
// //         List<Integer> a=new ArrayList<>();
// //         subsequence(0,nums,a,ans,n);
// //         return ans;
// //     }
// //     public void subsequence(int i,int[] nums,List<Integer> a,List<List<Integer>> ans,int n){
// //         if(i==n){
// //             return;
// //         }
        
// //         a.add(nums[i]);
// //         subsequence(i+1,nums,a,ans,n);
// //         ans.add(new ArrayList<>(a));
// //         subsequence(i+1,nums,a,ans,n);
// //         a.remove(a.size()-1);
// //     }
// // }
// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> a = new ArrayList<>();
//         subsequence(0, nums, a, ans);
//         return ans;
//     }

//     public void subsequence(int i, int[] nums, List<Integer> a, List<List<Integer>> ans) {
//         if (i == nums.length) {
//             ans.add(new ArrayList<>(a));
//             return;
//             }                
                
//         subsequence(i + 1, nums, a, ans); // Exclude the current element   
//         a.add(nums[i]);                 
//         subsequence(i + 1, nums, a, ans); // Include the current element

//         a.remove(a.size() - 1); // Backtrack
//     }
// }

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> each = new ArrayList<Integer>();
        sub(res,each,0,nums);
        return res;
    }

    public void sub(List<List<Integer>> res,List<Integer> each,int i,int[] nums){
        if(i==nums.length){
            res.add(each);
            return;
        }

        //pick
        each.add(nums[i]);
        sub(res,new ArrayList<Integer>(each),i+1,nums);
        each.remove(each.size()-1);

        //notpick
        sub(res,new ArrayList<Integer>(each),i+1,nums);
    }
}