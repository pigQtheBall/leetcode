package easy.q559;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int max = 0;
        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i=0; i<level; i++){
                Node cur = queue.poll();
                List<Node> children = cur.children;
                for(Node el : children){
                    if(el != null) queue.offer(el);
                }
            }
            max++;
        }
        return max;
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
}
