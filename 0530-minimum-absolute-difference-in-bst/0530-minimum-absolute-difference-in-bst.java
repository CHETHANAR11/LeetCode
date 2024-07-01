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
    public int getMinimumDifference(TreeNode root) {
         if (root == null) {
            return 0;
        }
        
        List<Integer> li = new ArrayList<>();
        inOrderTraversal(root, li);
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < li.size() - 1; i++) {
            int diff = Math.abs(li.get(i) - li.get(i + 1));
            min = Math.min(diff, min);
        }
        
        return min;
    }

    public static void inOrderTraversal(TreeNode root, List<Integer> li) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, li);
        li.add(root.val);
        inOrderTraversal(root.right, li);
    }
        
}
    
    
    // if(root==null){
    //         return 0;
    //     }
    //     List<Integer> li=new ArrayList<>();
    //     findMin(root,li);
    //     int min=Integer.MAX_VALUE;
    //     Collections.sort(li);
    //     for(int i=0;i<li.size()-2;i++){
    //        int diff=Math.abs(li.get(i)-li.get(i+1));
    //         min=Math.min(diff,min);
    //     }
    //     return min;
    // }
    // public static void findMin(TreeNode root, List<Integer> li){
    //     if(root==null){
    //         return;
    //     }
    //     li.add(root.val);
    //     findMin(root.left,li);
    //     findMin(root.right,li);
    // }