package easy;

import java.util.Scanner;

public class ExcelSheetColumnName {
    public static int titleToNumber(String columnTitle) {
        int n = 0;
        for (int i=0; i<columnTitle.length(); i++) {
            n = n*26 + columnTitle.charAt(i)-'A'+1;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(titleToNumber(s));
        scan.close();
    }
}
