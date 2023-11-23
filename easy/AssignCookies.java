import java.util.*;

// Assume you are an awesome parent and want to give your children some cookies.
// But, you should give each child at most one cookie.
// Each child i has a greed factor g[i], which is the minimum size of a cookie 
// that the child will be content with; and each cookie j has a size s[j].
// If s[j] >= g[i], we can assign the cookie j to the child i, and the child i
// will be content. Your goal is to maximize the number of your content children and
// output the maximum number.

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int pg = 0;
        int ps = 0;
        int c = 0;
        while (pg<g.length && ps<s.length) {
            if (g[pg]<=s[ps]) {
                ++c;
                ++pg;
                ++ps;
            } else {
                ++ps;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
