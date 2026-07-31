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
    TreeNode root;
    public TreeNode sortedArrayToBST(int[] nums) {

        sortedArrayToBST(nums , 0 , nums.length-1);

        return root;
        
    }
    private void sortedArrayToBST(int[] nums , int start, int end){
        if(start > end){
            return;
        }

        int mid = (start + end)/2;
        insert(nums[mid]);
        sortedArrayToBST(nums , start , mid-1 );
        sortedArrayToBST(nums , mid+1 , end);
    }
    public void insert(int val){
        root = insert(root, val);
    }

    private TreeNode insert(TreeNode node , int val){
        if(node == null){
            node = new TreeNode(val);
            return node;
        }

        if(val < node.val){
            node.left = insert(node.left , val);
        }
        if(val > node.val){
            node.right = insert(node.right , val);
        }

        return node;
    }
}