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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();

            double num = 0;
        
            for(int i = 0; i < size; i++){
                num = num + queue.peek().val;

                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }

                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }

                queue.poll();
            }

            double avg = num/ size;
            list.add(avg);
        }

        return list;
    }
}