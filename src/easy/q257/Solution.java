package easy.q257;

import leetcode.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null) return res;
        List<Integer> path = new ArrayList<>();
        traverse(root, path, res);
        return res;
    }

    public void traverse(TreeNode cur, List<Integer> path, List<String> res){
        path.add(cur.val);
        if(cur.left == null && cur.right == null){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<path.size()-1; i++){
                sb.append(path.get(i) + "->");
            }
            sb.append(path.get(path.size()-1));
            res.add(sb.toString());
            return;
        }
        if(cur.left != null){
            traverse(cur.left, path, res);
            path.remove(path.size()-1);
        }
        if(cur.right != null){
            traverse(cur.right, path, res);
            path.remove(path.size()-1);
        }
    }
}
