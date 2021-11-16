package easy.q206;
import leetcode.adt.ListNode;

public class Solution {
    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        return reverse(prev, cur);
    }

    public ListNode reverse(ListNode prev, ListNode cur){
        if(cur == null) return prev;
        ListNode tmp = cur.next;
        cur.next = prev;
        prev = cur;
        cur = tmp;
        return reverse(prev, tmp);


    }

    public ListNode reverseList3(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return prev;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode cur = head;
        while(cur.next != null){
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        cur.next = prev;
        return cur;
    }
}
