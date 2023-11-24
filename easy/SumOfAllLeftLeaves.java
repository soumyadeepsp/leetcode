import java.util.*;

// Given the root of a binary tree, return the sum of all left leaves.
// A leaf is a node with no children. 
// A left leaf is a leaf that is the left child of another node.

public class SumOfAllLeftLeaves {
    public static int sumOfLeftLeavesHelper(TreeNode root, String direction) {
        if (root==null) {
            return 0;
        }
        if (root.left==null && root.right==null && direction=="left") {
            return root.val;
        }
        int smallerProblem1 = sumOfLeftLeavesHelper(root.left, "left");
        int smallerProblem2 = sumOfLeftLeavesHelper(root.right, "right");
        return smallerProblem1+smallerProblem2;
    }
    public static int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeavesHelper(root, "none");
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