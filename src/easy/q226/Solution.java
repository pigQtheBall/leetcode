package easy.q226;

import leetcode.adt.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    // iterative solutions
    // depth-first
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            TreeNode tmp = cur.left;
            cur.left = cur.right;
            cur.right = tmp;
            if(cur.left != null) stack.push(cur.left);
            if(cur.right != null) stack.push(cur.right);
        }
        return root;
    }
    // breadth-first
    public TreeNode invertTree2(TreeNode root){
        if(root == null) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            TreeNode tmp = cur.left;
            cur.left = cur.right;
            cur.right = tmp;
            if(cur.left != null) queue.offer(cur.left);
            if(cur.right != null) queue.offer(cur.right);
        }
        return root;
    }

    // recursive solution
    public TreeNode invertTree1(TreeNode root) {
        if(root == null) return root;
        swap(root);
        invertTree1(root.left);
        invertTree1(root.right);
        return root;
    }

    public void swap(TreeNode root){
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
