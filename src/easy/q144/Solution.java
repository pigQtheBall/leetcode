package easy.q144;

import leetcode.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
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
