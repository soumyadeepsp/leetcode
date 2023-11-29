import java.util.*;

// Design a HashSet without using any built-in hash table libraries.
// Implement MyHashSet class:
// void add(key) Inserts the value key into the HashSet.
// bool contains(key) Returns whether the value key exists in the HashSet or not.
// void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.

public class DesignHashset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}

class MyHashSet {
    ArrayList<Node> arr;
    int bucketSize;
    public MyHashSet() {
        arr = new ArrayList<>();
        bucketSize = 100;
        for (int i=0; i<100; i++) {
            arr.add(null);
        }
    }
    
    public void add(int key) {
        int bucketIndex = Integer.hashCode(key)%bucketSize;
        Node head = arr.get(bucketIndex);
        if (head==null) {
            Node newNode = new Node(key);
            arr.set(bucketIndex, newNode);
        } else {
            Node temp = head;
            while (temp!=null) {
                if (temp.data==key) {
                    return;
                }
                temp = temp.next;
            }
            Node newNode = new Node(key);
            newNode.next = head;
            arr.set(bucketIndex, newNode);
        }
    }
    
    public void remove(int key) {
        int bucketIndex = Integer.hashCode(key)%bucketSize;
        Node head = arr.get(bucketIndex);
        if (head==null) {
            return;
        } else {
            Node temp = head;
            while (temp.next!=null) {
                System.out.println(temp.data);
                if (temp.next.data==key) {
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
            if (head.data==key) {
                arr.set(bucketIndex, head.next);
            }
        }
    }
    
    public boolean contains(int key) {
        int bucketIndex = Integer.hashCode(key)%bucketSize;
        Node head = arr.get(bucketIndex);
        while (head!=null) {
            if (head.data==key) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}