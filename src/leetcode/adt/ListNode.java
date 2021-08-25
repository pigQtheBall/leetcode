package leetcode.adt;

import leetcode.utils.ArrayUtils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode from(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        for (int a : arr) {
            prev.next = new ListNode(a);
            prev = prev.next;
        }
        return dummy.next;
    }

    public static ListNode from(String str) {
        return from(ArrayUtils.from(str));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode p = this;
        while (p != null) {
            if (p != this) sb.append(",");
            sb.append(p.val);
            p = p.next;
        }
        sb.append("]");
        return sb.toString();
    }
}