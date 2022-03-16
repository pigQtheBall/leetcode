package easy.q110;

import leetcode.adt.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(getHeight(root) == -1) return false;
        return true;
    }

    public int getHeight(TreeNode root){
        if(root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        // if left or right children tree is not balanced, then current is also not balanced
        if(leftHeight == -1 || rightHeight == -1) return -1;
        int curDiff = Math.abs(leftHeight - rightHeight);
        if(curDiff > 1) return -1;
        else return Math.max(leftHeight, rightHeight) + 1;
    }
}
