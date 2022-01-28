package medium.q107;

import leetcode.adt.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            // 把每次上一轮加进去的tree node读出来存到list里
            int len = queue.size();

            while(len > 0){
                TreeNode cur = queue.poll();
                level.add(cur.val);

                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
                len--;
            }
            res.add(level);
        }
        Collections.reverse(res);
        return res;
    }
}
