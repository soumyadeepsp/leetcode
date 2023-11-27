import java.util.*;

// In MATLAB, there is a handy function called reshape which can reshape 
// an m x n matrix into a new one with a different size r x c keeping its original data.
// You are given an m x n matrix mat and two integers r and c representing 
// the number of rows and the number of columns of the wanted reshaped matrix.
// The reshaped matrix should be filled with all the elements of the 
// original matrix in the same row-traversing order as they were.
// If the reshape operation with given parameters is possible and legal, 
// output the new reshaped matrix; Otherwise, output the original matrix.

public class ReshapeTheMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r*c != mat.length*mat[0].length) {
            return mat;
        }
        int[] arr = new int[r*c];
        int x = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                arr[x] = mat[i][j];
                ++x;
            }
        }
        x = 0;
        int[][] ans = new int[r][c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                ans[i][j] = arr[x];
                ++x;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}