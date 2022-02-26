package medium.q102;

import leetcode.adt.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    // using queue
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> itemList = new ArrayList<Integer>();
            int len = queue.size();

            while (len > 0) {
                TreeNode tmpNode = queue.poll();
                itemList.add(tmpNode.val);

                if (tmpNode.left != null) queue.offer(tmpNode.left);
                if (tmpNode.right != null) queue.offer(tmpNode.right);
                len--;
            }

            res.add(itemList);
        }
        return res;
    }
}