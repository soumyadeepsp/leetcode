package easy;

import java.util.Scanner;

public class MergeTwoSortedLists {
    public static void print(Node<Integer> head) {
        if (head==null) {
            return;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }
    public static Node<Integer> mergeTwoSortedLists(Node<Integer> head1, Node<Integer> head2) {
        if (head1==null) {
            return head2;
        }
        if (head2==null) {
            return head1;
        }
        if (head1.data <= head2.data) {
            head1.next = mergeTwoSortedLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeTwoSortedLists(head1, head2.next);
            return head2;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node<Integer> head1 = null;
        Node<Integer> temp1 = null;
        int data = scan.nextInt();
        while (data!=-1) {
            if (head1==null) {
                Node<Integer> newNode = new Node<>(data);
                head1 = newNode;
                temp1 = newNode;
            } else {
                Node<Integer> newNode = new Node<>(data);
                temp1.next = newNode;
                temp1 = temp1.next;
            }
            data = scan.nextInt();
        }
        Node<Integer> head2 = null;
        Node<Integer> temp2 = null;
        data = scan.nextInt();
        while (data!=-1) {
            if (head2==null) {
                Node<Integer> newNode = new Node<>(data);
                head2 = newNode;
                temp2 = newNode;
            } else {
                Node<Integer> newNode = new Node<>(data);
                temp2.next = newNode;
                temp2 = temp2.next;
            }
            data = scan.nextInt();
        }
        scan.close();
    }
}

class Node<T> {
    T data;
    Node<T> next;
    Node() {

    }
    Node(T data) {
        this.data = data;
    }
}