import java.util.*;

// Given the root of a binary tree, return the length of the diameter of the tree.
// The diameter of a binary tree is the length of the longest path between 
// any two nodes in a tree. This path may or may not pass through the root.
// The length of a path between two nodes is represented by the number of edges between them.

public class DiameterOfBinaryTree {
    public static pair diameterOfBinaryTreeHelper(TreeNode root) {
        if (root==null) {
            pair ans = new pair(0, 0);
            return ans;
        }
        pair smallerProblem1 = diameterOfBinaryTreeHelper(root.left);
        pair smallerProblem2 = diameterOfBinaryTreeHelper(root.right);
        int a = smallerProblem1.d;
        int b = smallerProblem2.d;
        int c = smallerProblem1.h + smallerProblem2.h + 1;
        int d = Math.max(a, Math.max(b,c));
        int h = Math.max(smallerProblem1.h, smallerProblem2.h)+1;
        pair biggerProblem = new pair(d, h);
        return biggerProblem;
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        return diameterOfBinaryTreeHelper(root).d-1;
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

class pair {
    int d;
    int h;
    pair() {

    }
    pair (int d, int h) {
        this.d = d;
        this.h = h;
    }
}