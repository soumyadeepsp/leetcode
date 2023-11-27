

// Given the root of a binary tree and an integer targetSum, return true if the tree 
// has a root-to-leaf path such that adding up all the values along the path equals targetSum.

import java.util.*;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null) {
            return false;
        }
        if (root.left==null && root.right==null) {
            if (targetSum==root.val) {
                return true;
            } else {
                return false;
            }
        }
        boolean smallerProblem1 = hasPathSum(root.left, targetSum-root.val);
        boolean smallerProblem2 = hasPathSum(root.right, targetSum-root.val);
        return smallerProblem1||smallerProblem2;
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
