

// Given the root of a binary tree, return its maximum depth.
// A binary tree's maximum depth is the number of nodes along the longest path from 
// the root node down to the farthest leaf node.

import java.util.*;

public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        int smallerProblem1 = maxDepth(root.left);
        int smallerProblem2 = maxDepth(root.right);
        int biggerProblem = Math.max(smallerProblem1,smallerProblem2)+1;
        return biggerProblem;
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