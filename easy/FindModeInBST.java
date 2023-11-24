import java.util.*;

// Given the root of a binary search tree (BST) with duplicates, return all the mode(s)
// (i.e., the most frequently occurred element) in it.
// If the tree has more than one mode, return them in any order.

public class FindModeInBST {
    public static int currentVal = Integer.MIN_VALUE;
    public static int currentFreq = 0;
    public static int maxFreq = 0;
    public static List<Integer> ans = new ArrayList<>();
    public static void findModeHelper(TreeNode root) {
        if (root==null) {
            return;
        }
        findModeHelper(root.left);
        if (currentVal==root.val) {
            ++currentFreq;
        } else {
            currentVal = root.val;
            currentFreq = 1;
        }
        if (currentFreq > maxFreq) {
            ans = new ArrayList<>();
            maxFreq = currentFreq;
        }
        if (currentFreq == maxFreq) {
            ans.add(currentVal);
        }
        findModeHelper(root.right);
    }
    public static int[] findMode(TreeNode root) {
        findModeHelper(root);
        int[] arr = new int[ans.size()];
        for (int i=0; i<ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {

    }
    TreeNode(int val) {
        this.val = val;
    }
}