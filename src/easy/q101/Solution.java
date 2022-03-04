package easy.q101;

import leetcode.adt.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        /** recursive
         *  compare left child tree and right child tree
         *  left: left - right - parent
         *  right: right - left - parent
         */
        if(root == null) return true;
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left, TreeNode right){
        if(left == null && right != null) return false;
        else if(left != null && right == null) return false;
        else if(left == null && right == null) return true;
        else if(left.val != right.val) return false;

        boolean outside = compare(left.left, right.right);
        boolean inside = compare(left.right, right.left);
        return outside && inside;
    }

    /** iterative solution
     *  using queue
     */
    public boolean isSymmetric2(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()){
            TreeNode l = queue.poll();
            TreeNode r = queue.poll();
            if (l == null && r == null) {
                continue;
            }
            if (l == null && r != null) {
                return false;
            }
            if (l != null && r == null) {
                return false;
            }
            if (l.val != r.val) {
                return false;
            }
            queue.offer(l.left);
            queue.offer(r.right);
            queue.offer(l.right);
            queue.offer(r.left);
        }
        return true;
    }
}
