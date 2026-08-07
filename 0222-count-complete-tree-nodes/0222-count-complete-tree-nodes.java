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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftHeight = goLeft(root);
        int rightHeight = goRight(root);

        int ans = 0;

        if(leftHeight == rightHeight){
            ans = (int)Math.pow(2, leftHeight) -1;
        }else{
            ans = 1 + countNodes(root.left) + countNodes(root.right);
        }


        
        return ans;
    }
    public int goLeft(TreeNode node){
        if(node == null){
            return 0;
        }
       
        int left = goLeft(node.left);
        return left + 1;
       
    }
    public int goRight(TreeNode node){
        if(node == null){
            return 0;
        }
       
        int right = goRight(node.right);
        return right + 1;
    }

    
}