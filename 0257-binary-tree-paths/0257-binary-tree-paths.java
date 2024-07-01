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
    public List<String> binaryTreePaths(TreeNode root)  {
        List<String> paths=new ArrayList<>();
        path(root,"",paths);
        return paths;
    }
    public void path(TreeNode node,String str,List<String> paths){
        if(node==null){
            return ;
        }
        else if(str.isEmpty()){
            str+=node.val;
        }
        else if(!str.isEmpty()){
            str+="->";
            str+=node.val;
        }
        if(node.left==null && node.right==null){
            paths.add(str);
            return;
        }
        path(node.left,str,paths);
        path(node.right,str,paths);
    }
}

 // if(root==null){
 //            ans.add(str);
 //            str="";
 //            return ans;
 //        }
 //        str+=root.val+"->";
 //        binaryTreePaths(root.left,ans);
 //        binaryTreePaths(root.right,ans);
 //        return ans;