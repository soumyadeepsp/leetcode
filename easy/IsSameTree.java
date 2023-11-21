import java.util.*;

// given the root of 2 trees, find if they are identical or not

public class IsSameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) {
            return true;
        }
        if (p==null && q!=null) {
            return false;
        }
        if (p!=null && q==null) {
            return false;
        }
        if (p.val!=q.val) {
            return false;
        }
        boolean smallerProblem1 = isSameTree(p.left, q.left);
        boolean smallerProblem2 = isSameTree(p.right, q.right);
        if (smallerProblem1 && smallerProblem2) {
            return true;
        } else {
            return false;
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
    TreeNode(int val) {
        this.val = val;
    }
}