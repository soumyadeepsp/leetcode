import java.util.*;

// You are given an m x n matrix M initialized with all 0's and an array of operations ops,
//  where ops[i] = [ai, bi] means M[x][y] should be incremented by one 
// for all 0 <= x < ai and 0 <= y < bi.
// Count and return the number of maximum integers in the matrix after 
// performing all the operations.

public class RangeAddition {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length==0) {
            return m*n;
        }
        int r = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        for(int i=0; i<ops.length; i++) {
            if (ops[i][0]<r) { 
                r = ops[i][0];
            }
            if (ops[i][1]<c) {
                c = ops[i][1];
            }
        }
        return r*c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}