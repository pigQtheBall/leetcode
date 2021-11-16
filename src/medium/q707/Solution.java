package medium.q707;

import java.util.List;

public class Solution {
    class MyLinkedList {
        int size;
        ListNode head;

        class ListNode {
            int val;
            ListNode next;
            ListNode(int x) { val = x; }
        }

        public MyLinkedList() {
            size = 0;
            head = new ListNode(0);
        }


        public int get(int index) {
            if(index < 0 || index >= size) return -1;
            ListNode cur = this.head;
            int ct = 0;
            while(ct < index){
                cur = cur.next;
                ct++;
            }
            return cur.next.val;
        }

        public void addAtHead(int val) {
            this.addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            this.addAtIndex(size, val);

        }

        public void addAtIndex(int index, int val) {
            if(index > size) return;
            if(index < 0) index = 0;
            ListNode add = new ListNode(val);
            this.size++;
            if(index == 0){
                add.next = this.head;
            }
            int ct = 0;
            ListNode cur = this.head;
            while(ct < index){
                cur = cur.next;
                ct++;
            }
            add.next = cur.next;
            cur.next = add;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;
            this.size--;
            int ct = 0;
            ListNode cur = this.head;
            while(ct < index){
                cur = cur.next;
                ct++;
            }
            cur.next = cur.next.next;

        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
