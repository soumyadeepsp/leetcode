

import java.util.Scanner;

public class GetDecimalValue {
    public static ListNode left = null;
    public static void print(ListNode head) {
        if (head==null) {
            return;
        }
        System.out.print(head.val+" ");
        print(head.next);
    }
    public static int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int n = 0;
        while (temp!=null) {
            n = n*2 + temp.val;
            temp = temp.next;
        }
        return n;
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
        System.out.println(getDecimalValue(head));
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