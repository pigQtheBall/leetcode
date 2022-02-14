package easy.q111;

import leetcode.adt.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int min = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            min++;
            while(level > 0){
                TreeNode cur = q.poll();
                if(cur.left == null && cur.right == null) return min;
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
                level--;
            }
        }
        return min;
    }
}
