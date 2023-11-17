package easy;

import java.util.Scanner;

public class ReverseLL {
    public static void print(ListNode head) {
        if (head==null) {
            return;
        }
        System.out.print(head.val+" ");
        print(head.next);
    }
    public static ListNode reverseLLRecursive(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }
        ListNode smallerProblem1 = head;
        ListNode smallerProblem2 = reverseLLRecursive(head.next);
        smallerProblem1.next.next = smallerProblem1;
        smallerProblem1.next = null;
        return smallerProblem2;
    }
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }
        ListNode temp1 = head;
        ListNode temp2 = temp1.next;
        ListNode temp3 = temp1.next.next;
        temp1.next = null;
        while (temp3!=null) {
            temp2.next = temp1;
            temp1 = temp2;
            temp2 = temp3;
            temp3 = temp3.next;
        }
        temp2.next = temp1;
        return temp2;
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
        print(head);
        head = reverseLLRecursive(head);
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