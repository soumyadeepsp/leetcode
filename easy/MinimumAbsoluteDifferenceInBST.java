import java.util.*;

// Given the root of a Binary Search Tree (BST), return the 
// minimum absolute difference between the values of any two different nodes in the tree.

public class MinimumAbsoluteDifferenceInBST {
    public static int diff = Integer.MAX_VALUE;
    public static int a = Integer.MIN_VALUE;
    public static void getMinimumDifferenceHelper(TreeNode root) {
        if (root==null) {
            return;
        }
        getMinimumDifferenceHelper(root.left);
        if (Math.abs(root.val-a) <= diff) {
            diff = Math.abs(root.val-a);
        }
        a = root.val;
        getMinimumDifferenceHelper(root.right);
    }
    public static int getMinimumDifference(TreeNode root) {
        a = root.val;
        getMinimumDifferenceHelper(root);
        return diff;
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
    TreeNode(int val) {
        this.val = val;
    }
}