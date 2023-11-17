package easy;

import java.util.Scanner;

public class MiddleNode {
    public static void print(ListNode head) {
        if (head==null) {
            return;
        }
        System.out.print(head.val+" ");
        print(head.next);
    }
    public static ListNode middleNode(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next==null) {
            return slow;
        } else {
            return slow.next;
        }
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
        System.out.println(middleNode(head).val);
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