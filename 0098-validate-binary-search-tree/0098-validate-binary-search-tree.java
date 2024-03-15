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
public class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrder =new LinkedList<>();
        helper(root,inOrder);
        
        boolean isBST=true;
        int prev= inOrder.get(0);
        for(int i=1;i<inOrder.size();i++){
            if(inOrder.get(i)<=prev){
              isBST=false;  
            }
            prev=inOrder.get(i);
        }
        return isBST;
    }

    void helper(TreeNode tree,List<Integer> inOrder){
        if(tree==null)return;
        
        helper(tree.left,inOrder);
        inOrder.add(tree.val);
        helper(tree.right,inOrder);
    }
}