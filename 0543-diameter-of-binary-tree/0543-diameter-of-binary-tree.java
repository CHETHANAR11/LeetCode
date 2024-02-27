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
    int cnt=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        depth(root);
        return cnt;
    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        int leftd=depth(root.left);
        int rightd=depth(root.right);
        cnt=Math.max(cnt,leftd+rightd);
        return Math.max(leftd,rightd)+1;
    }
}