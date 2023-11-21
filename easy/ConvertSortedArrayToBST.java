import java.util.*;

public class ConvertSortedArrayToBST {
    public static TreeNode sortedArrayToBSTHelper(int[] arr, int low, int high) {
        if (low>high) {
            return null;
        }
        if (low==high) {
            TreeNode root = new TreeNode(arr[low]);
            return root;
        }
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = sortedArrayToBSTHelper(arr, low, mid-1);
        root.right = sortedArrayToBSTHelper(arr, mid+1, high);
        return root;
    }
    public static TreeNode sortedArrayToBST(int[] arr) {
        return sortedArrayToBSTHelper(arr, 0, arr.length-1);
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