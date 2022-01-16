package easy.q145;

import leetcode.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
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
