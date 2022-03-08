package medium.q222;

import leetcode.adt.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ct = 0;
        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i=0; i<level; i++){
                TreeNode cur = queue.poll();
                ct++;
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }
        }
        return ct;
    }
}
