package medium.q19;

import leetcode.adt.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int ct = 0;
        ListNode left = new ListNode(-1);
        left.next = head;
        ListNode right = head;
        while(ct < n) {
            right = right.next;

            ct++;
        }
        if(right == null) {
            left = left.next.next;
            return left;
        }
        ListNode prev = null;
        while(right.next != null){
            right = right.next;
            left = left.next;
        }
        left = left.next;
        left.next = left.next.next;
        return head;
    }
}
