

// Given a binary tree, find its minimum depth.
// The minimum depth is the number of nodes along the shortest path 
// from the root node down to the nearest leaf node.
// Note: A leaf is a node with no children.

import java.util.Scanner;

public class MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        if (root.left==null && root.right!=null) {
            int smallerProblem = minDepth(root.right);
            return smallerProblem+1;
        } else if (root.right==null && root.left!=null) {
            int smallerProblem = minDepth(root.left);
            return smallerProblem+1;
        } else if (root.left==null && root.right==null) {
            return 1;
        } else {
            int smallerProblem1 = minDepth(root.right);
            int smallerProblem2 = minDepth(root.left);
            return Math.min(smallerProblem1, smallerProblem2)+1;
        }
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