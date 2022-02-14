package easy.q104;

import leetcode.adt.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        int max = 0;
        while(!q.isEmpty()){
            int level = q.size();
            while(level > 0){
                TreeNode cur = q.poll();
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
                level--;
            }
            max++;
        }
        return max;
    }
}
