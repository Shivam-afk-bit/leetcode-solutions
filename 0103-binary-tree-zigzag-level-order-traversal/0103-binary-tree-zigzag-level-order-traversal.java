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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        int count = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();

            for(int i = 0; i < size; i++){
                if(count % 2 == 0){
                    if(queue.peek().left != null){
                        queue.add(queue.peek().left);
                    }
                    if(queue.peek().right != null){
                        queue.add(queue.peek().right);
                    }

                    list.add(queue.poll().val);
                }else {
                    
                    if(queue.peek().left != null){
                        queue.add(queue.peek().left);
                    }
                    if(queue.peek().right != null){
                        queue.add(queue.peek().right);
                    }

                    stack.push(queue.poll().val);

                }
            }
            count++;
            if(!stack.isEmpty()){
                while(!stack.isEmpty()){
                    list.add(stack.pop());
                }

                ans.add(list);
            }else{

                ans.add(list);
            }

            
        }

        return ans;
    }
}