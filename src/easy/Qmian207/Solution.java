package easy.Qmian207;

import leetcode.adt.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        Set<ListNode> record = new HashSet<>();
        while(a != null){
            record.add(a);
            a = a.next;
        }
        while(b != null){
            if(record.contains(b)) return b;
            b = b.next;
        }
        return null;
    }
}
