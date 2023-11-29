import java.util.*;

// Given an array of points on the X-Y plane points where points[i] = [xi, yi],
// return the area of the largest triangle that can be formed by any three different points.
// Answers within 10-5 of the actual answer will be accepted.

public class LargestTriangleArea {
    public static double area(int x1, int x2, int y1, int y2, int z1, int z2) {
        double area = x1*(y2-z2) + y1*(z2-x2) + z1*(x2-y2);
        return 0.5*Math.abs(area);
    }
    public static double largestTriangleArea(int[][] points) {
        double largest = Integer.MIN_VALUE;
        for (int i=0; i<points.length; i++) {
            for (int j=0; j<points.length; j++) {
                for (int k=0; k<points.length; k++) {
                    int x1 = points[i][0];
                    int x2 = points[i][1];
                    int y1 = points[j][0];
                    int y2 = points[j][1];
                    int z1 = points[k][0];
                    int z2 = points[k][1];
                    double area = area(x1, x2, y1, y2, z1, z2);
                    if (area>largest) {
                        largest = area;
                    }
                }
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}