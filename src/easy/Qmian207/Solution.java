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

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0;
        int lenB = 0;
        while(curA != null){
            lenA++;
            curA = curA.next;
        }
        while(curB != null){
            lenB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        if(lenB > lenA){
            int tmp = lenA;
            lenA = lenB;
            lenB = tmp;
            curA = headB;
            curB = headA;
        }
        int gap = lenA - lenB;
        while(gap > 0){
            curA = curA.next;
            gap--;
        }
        while(curA != null){
            if(curA == curB) return curA;
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}
