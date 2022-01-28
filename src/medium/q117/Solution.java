package medium.q117;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Node prev = queue.poll();
            if(prev.left != null) queue.offer(prev.left);
            if(prev.right != null) queue.offer(prev.right);

            for(int i=0; i<size-1; i++){
                Node cur = queue.poll();
                prev.next = cur;
                prev = cur;

                if(prev.left != null) queue.offer(prev.left);
                if(prev.right != null) queue.offer(prev.right);
            }
        }
        return root;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

}
