import java.util.*;

public class BalancedBinaryTree {
    public static pair balancedBinaryTreeHelper(TreeNode root) {
        if (root==null) {
            pair ans = new pair(true, 0);
            return ans;
        }
        if (root.left==null && root.right==null) {
            pair ans = new pair(true, 1);
            return ans;
        }
        pair smallerProblem1 = balancedBinaryTreeHelper(root.left);
        pair smallerProblem2 = balancedBinaryTreeHelper(root.right);
        if (smallerProblem1.isBalanced && smallerProblem2.isBalanced && Math.abs(smallerProblem1.height-smallerProblem2.height)<=1) {
            pair ans = new pair(true, Math.max(smallerProblem1.height, smallerProblem2.height)+1);
            return ans;
        } else {
            pair ans = new pair(false, Math.max(smallerProblem1.height, smallerProblem2.height)+1);
            return ans;
        }
    }
    public static boolean balancedBinaryTree(TreeNode root) {
        return balancedBinaryTreeHelper(root).isBalanced;
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
    boolean isBalanced;
    int height;
    pair() {

    }
    pair(boolean isBalanced, int height) {
        this.isBalanced = isBalanced;
        this.height = height;
    }
}