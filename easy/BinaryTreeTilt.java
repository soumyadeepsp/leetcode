import java.util.*;

// Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

public class BinaryTreeTilt {
    public static int sum(TreeNode root) {
        if (root==null) {
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        return left+right+root.val;
    }
    public static int tilt(TreeNode root) {
        if (root==null) {
            return 0;
        }
        if (root.left==null && root.right==null) {
            int temp = root.val;
            root.val = 0;
            return temp;
        }
        int left = findTilt(root.left);
        int right = findTilt(root.right);
        int temp = root.val;
        root.val = Math.abs(left-right);
        return temp+left+right;
    }
    public static int findTilt(TreeNode root) {
        tilt(root);
        return sum(root);
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