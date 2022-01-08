package easy.q225;

import java.util.LinkedList;
import java.util.Queue;

// using 1 queue
public class MyStack {
    Queue<Integer> one;

    public MyStack() {
        this.one = new LinkedList<>();
    }

    public void push(int x) {
        one.add(x);
    }

    public int pop() {
        int n = one.size();
        n--;
        while(n>0){
            one.add(one.poll());
            n--;
        }
        int res = one.poll();
        return res;
    }

    public int top() {
        int res = this.pop();
        one.add(res);
        return res;
    }

    public boolean empty() {
        return one.isEmpty();
    }
}

//// using 2 queues
//public class MyStack {
//    Queue<Integer> one;
//    Queue<Integer> two;
//
//    public MyStack() {
//        this.one = new LinkedList<>();
//        this.two = new LinkedList<>();
//    }
//
//    public void push(int x) {
//        one.add(x);
//    }
//
//    public int pop() {
//        int n = one.size();
//        n--;
//        while(n>0){
//            two.add(one.poll());
//            n--;
//        }
//        int res = one.poll();
//        while(!two.isEmpty()){
//            one.add(two.poll());
//        }
//        return res;
//    }
//
//    public int top() {
//        int res = this.pop();
//        one.add(res);
//        return res;
//    }
//
//    public boolean empty() {
//        return one.isEmpty() && two.isEmpty();
//    }
//}