package easy;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedList {
    public static void print(ListNode head) {
        if (head==null) {
            return;
        }
        System.out.print(head.val+" ");
        print(head.next);
    }
    public static ListNode deleteDuplicatesRecursive(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }
        ListNode smallerProblem = deleteDuplicatesRecursive(head.next);
        if (head.val==smallerProblem.val) {
            return smallerProblem;
        } else {
            head.next = smallerProblem;
            return head;
        }
    }
    public static ListNode deleteDuplicatesIterative(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }
        ListNode temp = head;
        while (temp.next!=null) {
            if(temp.val==temp.next.val) {
                ListNode temp2 = temp;
                while (temp2!=null && temp2.val==temp.val) {
                    temp2 = temp2.next;
                }
                temp.next = temp2;
                if (temp2==null) {
                    break;
                }
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListNode head = null;
        ListNode temp = null;
        int data = scan.nextInt();
        while(data!=-1) {
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
        deleteDuplicatesIterative(head);
        System.out.println();
        print(head);
        scan.close();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int data) {
        this.val = data;
    }
}