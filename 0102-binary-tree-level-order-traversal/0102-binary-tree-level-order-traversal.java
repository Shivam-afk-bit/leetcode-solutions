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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

           for(int i = 0; i < levelSize; i++ ){
            if(queue.peek().left != null){
                queue.add(queue.peek().left);
                
            }
            if(queue.peek().right != null){
                queue.add(queue.peek().right);
            }
                
                currentLevel.add(queue.poll().val);
                
           }
           ans.add(currentLevel);
        }



        return ans;

    }
}