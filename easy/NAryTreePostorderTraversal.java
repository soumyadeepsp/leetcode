import java.util.*;

// Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

public class NAryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        if (root==null) {
            List<Integer> ans = new ArrayList<>();
            return ans;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=0; i<root.children.size(); i++) {
            List<Integer> smallerAns = postorder(root.children.get(i));
            for (int j=0; j<smallerAns.size(); j++) {
                ans.add(smallerAns.get(j));
            }
        }
        ans.add(root.val);
        return ans;
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