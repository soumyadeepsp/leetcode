import java.util.*;

public class InvertBinaryTree {
    public static TreeNode invertBinaryTree(TreeNode root) {
        if (root==null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
        return root;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}