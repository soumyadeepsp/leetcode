

import java.util.HashMap;
import java.util.Scanner;

public class IsLLCyclic {
    public static boolean isLLCyclic(ListNode head) {
        HashMap<ListNode, Boolean> map = new HashMap<>();
        while (head!=null) {
            if (map.containsKey(head)) {
                return true;
            } else {
                map.put(head, true);
                head = head.next;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListNode head = new ListNode(1);
        System.out.println(isLLCyclic(head));
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