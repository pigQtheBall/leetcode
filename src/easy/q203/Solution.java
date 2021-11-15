package easy.q203;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        if(head.next == null){
            if(head.val == val) return null;
            else return head;
        }
        ListNode cur = head;
        ListNode prev = new ListNode(0);
        ListNode tmp = prev;
        prev.next = cur;
        while(cur != null){
            if(cur.val == val){
                prev.next = cur.next;
                cur = cur.next;
                continue;
            }
            prev = cur;
            cur = cur.next;

        }

        return tmp.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
