package easy.q21;
import leetcode.adt.ListNode;

import java.util.List;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(0);
        ListNode hd = output;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                output.next = l1;
                l1 = l1.next;
            }else{
                output.next = l2;
                l2 = l2.next;
            }
            output = output.next;
        }
        if(l1 == null) output.next = l2;
        else output.next = l1;
        return hd.next;
    }
}

