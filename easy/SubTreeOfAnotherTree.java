import java.util.*;

// Given the roots of two binary trees root and subRoot, return true 
// if there is a subtree of root with the same structure and node values of subRoot 
// and false otherwise.

public class SubTreeOfAnotherTree {
    public static boolean isIdentical(TreeNode root1, TreeNode root2) {
        if (root1==null && root2==null) {
            return true;
        } else if (root1==null && root2!=null) {
            return false;
        } else if (root1!=null && root2==null) {
            return false;
        } else {
            boolean left = isIdentical(root1.left, root2.left);
            boolean right = isIdentical(root1.right, root2.right);
            if (root1.val==root2.val && left && right) {
                return true;
            } else {
                return false;
            }
        }
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root==null) {
            if (subRoot==null) {
                return true;
            } else {
                return false;
            }
        }
        if (isIdentical(root, subRoot)) {
            return true;
        } else {
            boolean left = isSubtree(root.left, subRoot);
            boolean right = isSubtree(root.right, subRoot);
            return left || right;
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