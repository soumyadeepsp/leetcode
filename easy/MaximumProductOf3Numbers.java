import java.util.*;

// Given an integer array nums, find three numbers whose product is maximum
// and return the maximum product.

public class MaximumProductOf3Numbers {
    public static int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        return Math.max(arr[0]*arr[1]*arr[l-1], arr[l-1]*arr[l-2]*arr[l-3]);
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