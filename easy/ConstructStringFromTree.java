import java.util.*;

// Given the root of a binary tree, construct a string consisting of parenthesis and integers
// from a binary tree with the preorder traversal way, and return it.
// Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship
// between the string and the original binary tree.

public class ConstructStringFromTree {
    public static String tree2str(TreeNode root) {
        if (root==null) {
            return "";
        }
        String ans = root.val+"";
        if (root.left==null && root.right==null) {
            return ans;
        }
        ans = ans + "(";
        ans = ans + tree2str(root.left);
        ans = ans + ")";
        if (root.right!=null) {
            ans = ans + "(";
            ans = ans + tree2str(root.right);
            ans = ans + ")";
        }
        return ans;
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