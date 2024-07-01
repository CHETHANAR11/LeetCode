/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        find(root,hm);
        int max=0;
        for(Map.Entry<Integer,Integer> mp:hm.entrySet()){
            max=Math.max(mp.getValue(),max);
        }
         for(Map.Entry<Integer,Integer> mp:hm.entrySet()){
           if(max==mp.getValue()){
               li.add(mp.getKey());
           }
        }
        
        int n=li.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=li.get(i);
        }
        return ans;
    }
    public void find(TreeNode root,HashMap<Integer,Integer> hm){
        if(root==null){
            return;
        }
        hm.put(root.val,hm.getOrDefault(root.val,0)+1);
        find(root.left,hm);
        find(root.right,hm);
    }
}