package easy.q225;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> one;
    Queue<Integer> two;

    public MyStack() {
        this.one = new LinkedList<>();
        this.two = new LinkedList<>();
    }

    public void push(int x) {
        one.add(x);
    }

    public int pop() {
        int tmp = Integer.MAX_VALUE;
        while(!one.isEmpty()){
            tmp = one.poll();
            two.add(tmp);
        }
        while(!two.isEmpty()){
            int added = two.poll();
            if(added != tmp) one.add(added);
        }
        return tmp < Integer.MAX_VALUE ? tmp : null;
    }

    public int top() {
        int tmp = Integer.MAX_VALUE;
        while(!one.isEmpty()){
            tmp = one.poll();
            two.add(tmp);
        }
        while(!two.isEmpty()){
            one.add(two.poll());
        }
        return tmp < Integer.MAX_VALUE ? tmp : null;
    }

    public boolean empty() {
        return one.isEmpty() && two.isEmpty();
    }
}
