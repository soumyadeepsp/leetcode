import java.util.*;

// Given a n-ary tree, find its maximum depth.

public class MaximumDepthOfNAryTree {
    public static int maxDepth(Node root) {
        if (root==null) {
            return 0;
        }
        int ans = 0;
        for (int i=0; i<root.children.size(); i++) {
            ans = Math.max(ans, maxDepth(root.children.get(i)));
        }
        return ans+1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}

class Node {
    public int val;
    public List<Node> children;
    public Node() {}
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}