package easy.q94;

import leetcode.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
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
