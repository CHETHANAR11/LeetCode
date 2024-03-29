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
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) return false;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int prevVal = level % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int val = node.val;

                if (level % 2 == 0) { // Even level, values should be in strictly decreasing order
                    if (val % 2 == 0 || val <= prevVal) return false;
                } else { // Odd level, values should be in strictly increasing order
                    if (val % 2 != 0 || val >= prevVal) return false;
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);

                prevVal = val;
            }
            level++;
        }
        return true;
    }
}