

import java.util.Scanner;

public class IsPalindrome {
    public static ListNode left = null;
    public static void print(ListNode head) {
        if (head==null) {
            return;
        }
        System.out.print(head.val+" ");
        print(head.next);
    }
    public static boolean isPalindrome(ListNode head) {
        if (head==null) {
            return true;
        }
        if (left==null) {
            left = head;
        }
        boolean smallerProblem = isPalindrome(head.next);
        ListNode right = head;
        if (left.val!=right.val) {
            return false;
        }
        left = left.next;
        return smallerProblem;
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
        System.out.println(isPalindrome(head));
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