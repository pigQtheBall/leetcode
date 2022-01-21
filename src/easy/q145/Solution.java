package easy.q145;

import leetcode.adt.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution {
    // iterative solution 2
    public List<Integer> postorderTraversal3(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode top = stack.peek();
            if(top != null){
                stack.pop();
                stack.push(top);
                stack.push(null);
                if(top.right != null) stack.push(top.right);
                if(top.left != null) stack.push(top.left);
            }else{
                stack.pop();
                res.add(stack.pop().val);
            }
        }
        return res;
    }

    // iterative solution
    public List<Integer> postorderTraversal2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            res.add(cur.val);
            if(cur.left != null) stack.push(cur.left);
            if(cur.right != null) stack.push(cur.right);
        }
        Collections.reverse(res);
        return res;
    }

    // recursive solution
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        postorder(res, root);
        return res;
    }

    public static void postorder(ArrayList<Integer> res, TreeNode root){
        if(root == null) return;
        postorder(res, root.left);
        postorder(res, root.right);
        res.add(root.val);
    }
}
