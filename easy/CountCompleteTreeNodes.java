import java.util.*;

// count the total number of nodes in a complete binary tree

public class CountCompleteTreeNodes {
    public static int countNodes(TreeNode root) {
        if (root==null) {
            return 0;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
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