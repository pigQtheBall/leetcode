package easy.q94;

import leetcode.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> inorderTraversal4(TreeNode root) {
        // order: left, root, right
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        // we only add the value into result list when we meet a null node
        // use null as a marker to mark the order
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            if(cur != null){
                if(cur.right != null) stack.push(cur.right);
                stack.push(cur);
                stack.push(null);
                if(cur.left != null) stack.push(cur.left);
            }else{
                res.add(stack.pop().val);
            }
        }
        return res;
    }

    // iterative solution 2
    public List<Integer> inorderTraversal3(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode top = stack.peek();
            if(top != null){
                stack.pop();
                if(top.right != null) stack.push(top.right);
                stack.push(top);
                stack.push(null);
                if(top.left != null) stack.push(top.left);
            }else{
                stack.pop();
                res.add(stack.pop().val);
            }
        }
        return res;
    }

    // iterative solution
    public List<Integer> inorderTraversal2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            // continue to go left
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
                // we have reached a leftmost leaf node
            }else{
                // add root node value
                cur = stack.pop();
                res.add(cur.val);
                // traverse right
                cur = cur.right;
            }
        }
        return res;
    }

    // recursive solution
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inorder(res, root);
        return res;
    }

    public static void inorder(ArrayList<Integer> res, TreeNode root){
        if(root == null) return;
        inorder(res, root.left);
        res.add(root.val);
        inorder(res, root.right);
    }
}
