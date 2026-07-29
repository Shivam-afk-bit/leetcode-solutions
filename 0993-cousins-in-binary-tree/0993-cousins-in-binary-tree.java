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

    TreeNode nodeX;
    int levelX = 0;
    TreeNode nodeY;
    int levelY = 0;
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null){
            return false;
        }

        if(root.val == x || root.val == y){
            return false;
        }

        findNodeX(root , 0 , x);
        findNodeY(root , 0 , y);

        if(levelX != levelY){
            return false;
        }else if(levelX == levelY){
            
                if(isSibling(root , nodeX, nodeY)){
                    return false;
                }
        }


        return true;



        
    }
    public void findNodeX(TreeNode node , int level, int x){

        if(node == null){
            return;
        }

        if(node.val == x){
            nodeX = node;
            levelX = level;
            return;
        }

        findNodeX(node.left , level+1 , x);
        findNodeX(node.right , level+1 , x);
    }

    public void findNodeY(TreeNode node , int level, int y){
        if(node == null){
            return;
        }
        if(node.val == y){
            nodeY = node;
            levelY = level;
            return;
        }

        findNodeY(node.left , level+1 , y);
        findNodeY(node.right , level+1 , y);
    }

    public boolean isSibling(TreeNode node, TreeNode node1, TreeNode node2){
        if(node == null){
            return false;
        }
        if((node.left == node1 || node.right == node1) && (node.left == node2 || node.right == node2)){
            return true;
        }

        return isSibling(node.left , node1 , node2) || isSibling(node.right , node1 , node2);
    }
}