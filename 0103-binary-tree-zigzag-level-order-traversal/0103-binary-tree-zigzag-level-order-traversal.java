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
class Solution 
{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        LinkedList<TreeNode> queue= new LinkedList();
        List<Integer> small=new ArrayList<>();
        queue.add(root);
        int zig=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-->0){
                TreeNode fnt= queue.poll();
                small.add(fnt.val);
                if(fnt.left!=null)queue.add(fnt.left);
                if(fnt.right!=null)queue.add(fnt.right);
            }
            if(zig==1){
                Collections.reverse(small);
            }
            zig = (zig == 1) ? 0 : 1;
            ans.add(new ArrayList<>(small));
            small.clear();
        }
        return ans;
    }

}

    