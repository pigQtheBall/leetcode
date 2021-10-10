package easy.q141;

import leetcode.adt.ListNode;
import java.util.HashMap;

public class Solution {
    public static boolean hasCycle(ListNode head) {
        // key = node.val
        // value = next node
        HashMap<Integer, ListNode> map = new HashMap<Integer, ListNode>();
        if (head == null) return false;
        ListNode node = head;
        while(node != null) {
//            System.out.println(head.val);
            if (map.containsValue(node.next)) return true;
            else {
                map.put(node.val, node.next);
                node = node.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode hd = new ListNode(3);

        ListNode node2 = new ListNode(2);
        hd.next = node2;

        ListNode node3 = new ListNode(0);
        node2.next = node3;

        ListNode node4 = new ListNode(-4);
        node3.next = node4;
        node4.next = node2;

        boolean result = hasCycle(hd);
        System.out.println(result);

    }
}

