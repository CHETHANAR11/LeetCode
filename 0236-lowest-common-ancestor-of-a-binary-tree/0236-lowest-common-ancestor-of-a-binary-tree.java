/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     public boolean rootToNodePath(TreeNode node, TreeNode data, ArrayList<TreeNode> ans) {
        if (node == null)
            return false;
        if (node == data) {
            ans.add(node);
            return true;
        }

        boolean res = rootToNodePath(node.left, data, ans) || rootToNodePath(node.right, data, ans);
        if (res)
            ans.add(node);

        return res;

    }
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> list1 = new ArrayList<>();
        ArrayList<TreeNode> list2 = new ArrayList<>();

        rootToNodePath(root, p, list1);
        rootToNodePath(root, q, list2);

        int i = list1.size() - 1;
        int j = list2.size() - 1;

        TreeNode LCA = null;

        while (i >= 0 && j >= 0) {
            if (list1.get(i) != list2.get(j)) // cpp : list1[i] == list2[j]
                break;

            LCA = list1.get(i);
            i--;
            j--;
        }

        return LCA;
    }
}