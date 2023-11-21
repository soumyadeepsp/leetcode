import java.util.*;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}

class MyQueue {
    public Stack<Integer> s1;
    public Stack<Integer> s2;
    int c = 0;
    public MyQueue() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.add(x);
        ++c;
    }
    
    public int pop() {
        if (c==0) {
            return -1;
        }
        while (s1.size()>1) {
            s2.add(s1.pop());
        }
        int temp = s1.pop();
        while (!s2.isEmpty()) {
            s1.add(s2.pop());
        }
        --c;
        return temp;
    }
    
    public int peek() {
        if (c==0) {
            return -1;
        }
        while (s1.size()>1) {
            s2.add(s1.pop());
        }
        int temp = s1.peek();
        while (!s2.isEmpty()) {
            s1.add(s2.pop());
        }
        return temp;
    }
    
    public boolean empty() {
        if (c==0) {
            return true;
        } else {
            return false;
        }
    }
}