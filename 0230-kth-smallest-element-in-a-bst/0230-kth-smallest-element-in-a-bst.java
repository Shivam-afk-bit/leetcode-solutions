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
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        smallest(root , list);

        int ans = 0;

        for(int i =0; i < list.size(); i++){
            if(i == k-1){
                ans = list.get(i);
                break;
            }
        }

        return ans;
        
        
    }
    public void smallest(TreeNode node , ArrayList<Integer> list){
        if(node == null){
            return ;
        }
        

        smallest(node.left , list) ;
        list.add(node.val);
        smallest(node.right, list ) ;
        

      
       
    }
}