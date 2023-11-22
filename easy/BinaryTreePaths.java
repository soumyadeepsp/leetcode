import java.util.*;

// return a list containting the paths of all leafnodes from root

public class BinaryTreePaths {
    public static List<TreeNode> getAllLeafNodes(TreeNode root) {
        if (root==null) {
            return null;
        }
        if (root.left==null && root.right==null) {
            List<TreeNode> ans = new ArrayList<>();
            ans.add(root);
            return ans;
        }
        List<TreeNode> left = getAllLeafNodes(root.left);
        List<TreeNode> right = getAllLeafNodes(root.right);
        if (left==null) {
            return right;
        }
        if (right==null) {
            return left;
        }
        for (int i=0; i<right.size(); i++) {
            left.add(right.get(i));
        }
        return left;
    }
    public static List<TreeNode> getPath(TreeNode root, TreeNode node) {
        if (root==null) {
            return null;
        }
        if (root==node) {
            List<TreeNode> ans = new ArrayList<>();
            ans.add(root);
            return ans;
        }
        List<TreeNode> left = getPath(root.left, node);
        if (left!=null) {
            left.add(root);
            return left;
        } else {
            List<TreeNode> right = getPath(root.right, node);
            if (right!=null) {
                right.add(root);
                return right;
            } else {
                return null;
            }
        }
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        List<TreeNode> allLeafNodes = getAllLeafNodes(root);
        for (TreeNode x : allLeafNodes) {
            System.out.print(x.val+" ");
        }
        for (int i=0; i<allLeafNodes.size(); i++) {
            TreeNode leafNode = allLeafNodes.get(i);
            List<TreeNode> path = getPath(root, leafNode);
            Collections.reverse(path);
            // System.out.print(leafNode.val+": ");
            // for (int j=0; j<path.size(); j++) {
            //     System.out.print(path.get(j).val+" ");
            // }
            // System.out.println();
            String s = "";
            for (int j=0; j<path.size(); j++) {
                s = s + path.get(j).val+"->";
            }
            s = s.substring(0, s.length()-2);
            ans.add(s);
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