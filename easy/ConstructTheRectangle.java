import java.util.*;

// A web developer needs to know how to design a web page's size. So, given a specific 
// rectangular web page’s area, your job by now is to design a rectangular web page, 
// whose length L and width W satisfy the following requirements:
// The area of the rectangular web page you designed must equal to the given target area.
// The width W should not be larger than the length L, which means L >= W.
// The difference between length L and width W should be as small as possible.
// Return an array [L, W] where L and W are the length and width of the web page
//  you designed in sequence.

public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int b = 1;
        int l = area;
        int i = 2;
        int[] ans = new int[2];
        while (i<=area/2) {
            if (area%i==0 && Math.abs(i-area/i)<(l-b)) {
                l = area/i;
                b = i;
            }
            ++i;
        }
        ans[0] = l;
        ans[1] = b;
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}