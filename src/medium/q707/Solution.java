package medium.q707;

public class Solution {
    class MyLinkedList {
        int val;
        MyLinkedList next;

        public MyLinkedList() {
        }

        public MyLinkedList(int val){
            this.val = val;
            this.next = null;
        }

        public MyLinkedList(int val, MyLinkedList next){
            this.val = val;
            this.next = next;
        }

        public int get(int index) {
            if(index == 0) return this.val;
            int ct = 1;
            MyLinkedList tmp = this.next;
            while(tmp != null){
                if(ct == index) return tmp.val;
                tmp = tmp.next;
                ct++;
            }
            return -1;
        }

        public MyLinkedList getNode(int index) {
            if(index < 0) return null;
            if(index == 0) return this;
            int ct = 1;
            MyLinkedList tmp = this.next;
            while(tmp != null){
                if(ct == index) return tmp;
                tmp = tmp.next;
                ct++;
            }
            return null;
        }

        public void addAtHead(int val) {
            MyLinkedList hd = new MyLinkedList(val);
            hd.next = this;
        }

        public void addAtTail(int val) {
            MyLinkedList tl = new MyLinkedList(val);
            if(this.next == null) this.next = tl;
            MyLinkedList cur = this;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = tl;

        }

        public void addAtIndex(int index, int val) {
            MyLinkedList el = new MyLinkedList(val);
            MyLinkedList prev = this.getNode(index - 1);
            MyLinkedList after = this.next; // = this.getNode(index + 1);
            if(prev != null){
                after = prev.next.next;
                prev.next = el;
            }
            el.next = after;
        }

        public void deleteAtIndex(int index) {
            MyLinkedList prev = this.getNode(index - 1);
            MyLinkedList after = this.next;
            if(prev != null){
                after = prev.next.next;
                prev.next = after;
            }

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
