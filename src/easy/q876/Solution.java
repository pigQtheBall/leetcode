package easy.q876;

import java.util.List;

public class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        if(head.next.next == null) return head.next;
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast.next!=null){
            if(fast.next.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }else{
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow.next;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }