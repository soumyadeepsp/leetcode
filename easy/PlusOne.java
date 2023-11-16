package easy;

import java.util.Scanner;

public class PlusOne {
    public static int[] plusOne(int[] arr) {
        int i = arr.length-1;
        while (arr[i]==9 && i>0) {
            arr[i] = 0;
            i--;
        }
        if (arr[i]==9) {
            int[] newArr = new int[arr.length+1];
            newArr[0] = 1;
            return newArr;
        }
        arr[i] = arr[i] + 1;
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        plusOne(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
}
