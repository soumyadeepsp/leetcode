package easy;

import java.util.Scanner;

public class GetIntersectionOf2LL {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = 0;
        int l2 = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1!=null) {
            ++l1;
            temp1 = temp1.next;
        }
        while (temp2!=null) {
            ++l2;
            temp2 = temp2.next;
        }
        temp1 = headA;
        temp2 = headB;
        if (l1>l2) {
            while (l1!=l2) {
                temp1 = temp1.next;
                --l1;
            }
        }
        if (l2>l1) {
            while (l2!=l1) {
                temp2 = temp2.next;
                --l2;
            }
        }
        while (temp1!=temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);
        System.out.println(getIntersectionNode(head1, head2));
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