package easy;

import java.util.List;
import java.util.Scanner;

public class RemoveLLElements {
    public static void print(ListNode head) {
        if (head==null) {
            return;
        }
        System.out.print(head.val+" ");
        print(head.next);
    }
    public static ListNode removeElements(ListNode head, int val) {
        if (head==null) {
            return head;
        }
        ListNode temp1 = head;
        ListNode temp2 = head;
        while (temp1!=null && temp1.val==val) {
            temp1 = temp1.next;
        }
        head = temp1;
        if (head==null) {
            return head;
        }
        while (temp1.next!=null) {
            if (temp1.next.val==val) {
                temp2 = temp1.next;
                while (temp2!=null && temp2.val==val) {
                    temp2 = temp2.next;
                }
                temp1.next = temp2;
            }
            temp1 = temp1.next;
            if (temp1==null) {
                return head;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        ListNode head = null;
        ListNode temp = head;
        while (data!=-1) {
            ListNode newNode = new ListNode(data);
            if (head==null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
            data = scan.nextInt();
        }
        int val = scan.nextInt();
        head = removeElements(head, val);
        print(head);
        scan.close();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}