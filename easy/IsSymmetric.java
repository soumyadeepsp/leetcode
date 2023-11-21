import java.util.*;

//given a tree check if it is symmetric along its center

public class IsSymmetric {
    public static boolean isMirror(TreeNode root1, TreeNode root2) {
        if (root1==null && root2==null) {
            return true;
        } else if (root1==null && root2!=null) {
            return false;
        } else if (root1!=null && root2==null) {
            return false;
        } else {
            if (root1.val!=root2.val) {
                return false;
            }
            boolean smallerProblem1 = isMirror(root1.left, root2.right);
            boolean smallerProblem2 = isMirror(root1.right, root2.left);
            if (smallerProblem1 && smallerProblem2) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}