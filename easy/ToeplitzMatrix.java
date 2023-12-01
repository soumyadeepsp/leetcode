import java.util.*;

// Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
// A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.

public class ToeplitzMatrix {
    public static boolean checkDiagonal(int[][] matrix, int r, int c) {
        int x = matrix[r][c];
        int i = r;
        int j = c;
        while (i<matrix.length && j<matrix[0].length) {
            if (matrix[i][j]!=x) {
                return false;
            }
            ++i;
            ++j;
        }
        return true;
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i=0; i<n; i++) {
            if (checkDiagonal(matrix, 0, i)==false) {
                return false;
            }
        }
        for (int i=0; i<m; i++) {
            if (checkDiagonal(matrix, i, 0)==false) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}