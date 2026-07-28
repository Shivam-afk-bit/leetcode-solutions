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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();


            for(int i = 0; i < size; i++){

                if(i == size-1){
                    
                    if(queue.peek().left != null){
                        queue.offer(queue.peek().left);
                    }
                    if(queue.peek().right != null){
                        queue.offer(queue.peek().right);
                    }

                    list.add(queue.poll().val);
                    
                }else {

                   
                    if(queue.peek().left != null){
                        queue.offer(queue.peek().left);
                    }
                    if(queue.peek().right != null){
                        queue.offer(queue.peek().right);
                    }

                    queue.poll();
                    
                }
            }
        }

        return list;
    }
}