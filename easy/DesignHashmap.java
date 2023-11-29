import java.util.*;

// Design a HashMap without using any built-in hash table libraries.
// Implement the MyHashMap class:
// MyHashMap() initializes the object with an empty map.
// void put(int key, int value) inserts a (key, value) pair into the HashMap. 
// If the key already exists in the map, update the corresponding value.
// int get(int key) returns the value to which the specified key is mapped, or -1 
// if this map contains no mapping for the key.
// void remove(key) removes the key and its corresponding value 
// if the map contains the mapping for the key.

public class DesignHashmap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}

class MyHashMap {
    ArrayList<Node> arr;
    int bucketSize;
    public MyHashMap() {
        arr = new ArrayList<>();
        bucketSize = 100;
        for (int i=0; i<100; i++) {
            arr.add(null);
        }
    }
    
    public void put(int key, int value) {
        int bucketIndex = Integer.hashCode(key)%bucketSize;
        Node head = arr.get(bucketIndex);
        if (head==null) {
            Node newNode = new Node(key, value);
            arr.set(bucketIndex, newNode);
        } else {
            Node temp = head;
            while (temp!=null) {
                if (temp.key==key) {
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }
            Node newNode = new Node(key, value);
            newNode.next = head;
            arr.set(bucketIndex, newNode);
        }
    }
    
    public int get(int key) {
        int bucketIndex = Integer.hashCode(key)%bucketSize;
        Node head = arr.get(bucketIndex);
        if (head==null) {
            return -1;
        } else {
            Node temp = head;
            while (temp!=null) {
                if (temp.key==key) {
                    return temp.value;
                }
                temp = temp.next;
            }
            return -1;
        }
    }
    
    public void remove(int key) {
        int bucketIndex = Integer.hashCode(key)%bucketSize;
        Node head = arr.get(bucketIndex);
        if (head==null) {
            return;
        } else {
            Node temp = head;
            if (head.key==key) {
                arr.set(bucketIndex, head.next);
                return;
            }
            while (temp.next!=null) {
                if (temp.next.key==key) {
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
        }
    }
}

class Node {
    int key;
    int value;
    Node next;
    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}