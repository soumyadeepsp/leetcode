

import java.util.Scanner;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        String columnName = "";
        while (columnNumber > 0) {
            int rem = columnNumber%26;
            if (rem==0) {
                columnName = 'Z' + columnName;
                columnNumber = columnNumber/26 - 1;
            } else {
                columnName = (char)(rem-1+'A') + columnName;
                columnNumber = columnNumber/26;
            }
        }
        return columnName;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(convertToTitle(n));
        scan.close();
    }
}
