import java.util.*;

// Given the root of a binary tree, construct a string consisting of parenthesis and integers
// from a binary tree with the preorder traversal way, and return it.
// Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship
// between the string and the original binary tree.

public class Merge2BinaryTrees {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null && root2==null) {
            return null;
        } else if (root1==null && root2!=null) {
            return root2;
        } else if (root1!=null && root2==null) {
            return root1;
        } else {
            TreeNode root = new TreeNode(root1.val+root2.val);
            TreeNode left = mergeTrees(root1.left, root2.left);
            TreeNode right = mergeTrees(root1.right, root2.right);
            root.left = left;
            root.right = right;
            return root;
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
    TreeNode() {

    }
    TreeNode(int val) {
        this.val = val;
    }
}