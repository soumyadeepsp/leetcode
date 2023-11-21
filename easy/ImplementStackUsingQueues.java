import java.util.*;

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}

class MyStack {
    public Queue<Integer> q1;
    public Queue<Integer> q2;
    public int c = 0;
    public MyStack() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
        ++c;
    }
    
    public int pop() {
        if (c==0) {
            return -1;
        }
        while (q1.size()>1) {
            q2.add(q1.poll());
        }
        int temp = q1.poll();
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
        --c;
        return temp;
    }
    
    public int top() {
        if (c==0) {
            return -1;
        }
        while (q1.size()>1) {
            q2.add(q1.poll());
        }
        int temp = q1.peek();
        q2.add(q1.poll());
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
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