package easy.q144;

import com.sun.source.tree.Tree;
import leetcode.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    // iterative solution 2
    public List<Integer> preorderTraversal3(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode top = stack.peek();
            if(top != null){
                stack.pop();
                if(top.right != null) stack.push(top.right);
                if(top.left != null) stack.push(top.left);
                stack.push(top);
                stack.push(null);
            }else{
                stack.pop();
                res.add(stack.pop().val);
            }
        }
        return res;
    }

    // iterative solution
    public List<Integer> preorderTraversal2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            res.add(cur.val);
            if(cur.right != null) stack.push(cur.right);
            if(cur.left != null) stack.push(cur.left);
        }
        return res;
    }

    // recursive solution
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        preorder(res, root);
        return res;
    }

    public static void preorder(ArrayList<Integer> res, TreeNode root){
        if(root == null) return;
        res.add(root.val);
        preorder(res, root.left);
        preorder(res, root.right);
    }
}
