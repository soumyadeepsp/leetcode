import java.util.*;

// An image smoother is a filter of the size 3 x 3 that can be applied to each cell
// of an image by rounding down the average of the cell and the eight surrounding cells
// (i.e., the average of the nine cells in the blue smoother).
// If one or more of the surrounding cells of a cell is not present, 
// we do not consider it in the average (i.e., the average of the four cells in the red smoother).

public class ImageSmoother {
    public static boolean isExist(int[][] img, int i, int j) {
        if (i>=0 && i<img.length && j>=0 && j<img[0].length) {
            return true;
        } else {
            return false;
        }
    }
    public static int[][] imageSmoother(int[][] img) {
        int[][] ans = new int[img.length][img[0].length];
        for (int i=0; i<img.length; i++) {
            for (int j=0; j<img[0].length; j++) {
                int s = 0;
                int d = 0;
                if (isExist(img, i-1, j-1)) {
                    s = s + img[i-1][j-1];
                    ++d;
                }
                if (isExist(img, i-1, j)) {
                    s = s + img[i-1][j];
                    ++d;
                }
                if (isExist(img, i-1, j+1)) {
                    s = s + img[i-1][j+1];
                    ++d;
                }
                if (isExist(img, i, j-1)) {
                    s = s + img[i][j-1];
                    ++d;
                }
                s = s + img[i][j];
                ++d;
                if (isExist(img, i, j+1)) {
                    s = s + img[i][j+1];
                    ++d;
                }
                if (isExist(img, i+1, j-1)) {
                    s = s + img[i+1][j-1];
                    ++d;
                }
                if (isExist(img, i+1, j)) {
                    s = s + img[i+1][j];
                    ++d;
                }
                if (isExist(img, i+1, j+1)) {
                    s = s + img[i+1][j+1];
                    ++d;
                }
                ans[i][j] = s/d;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}