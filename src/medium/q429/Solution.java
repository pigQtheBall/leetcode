package medium.q429;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<size; i++){
                Node cur = queue.poll();
                level.add(cur.val);
                List<Node> children = cur.children;
                if(children != null || children.size() != 0){
                    for(Node el : children){
                        if(el != null) queue.offer(el);
                    }
                }
            }
            res.add(level);
        }
        return res;
    }

    }

     class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
    }
}
