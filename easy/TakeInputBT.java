import java.util.*;

public class TakeInputBT {
    public static Scanner scan = new Scanner(System.in);
    public static TreeNode<Integer> takeInput(int data, boolean isRoot, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter the root data = ");
        } else {
            if (isLeft) {
                System.out.println("Enter the data of left child of = "+data);
            } else {
                System.out.println("Enter the data of right child of = "+data);
            }
        }
        data = scan.nextInt();
        if (data==-1) {
            return null;
        } else {
            TreeNode<Integer> root = new TreeNode<>(data);
            TreeNode<Integer> leftSubtree = takeInput(data, false, true);
            TreeNode<Integer> rightSubtree = takeInput(data, false, false);
            root.left = leftSubtree;
            root.right = rightSubtree;
            return root;
        }
    }
    public static void print(TreeNode<Integer> root) {
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput(Integer.MAX_VALUE, true, false);
        print(root);
    }
}

class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;
    TreeNode(T data) {
        this.data = data;
    }
}