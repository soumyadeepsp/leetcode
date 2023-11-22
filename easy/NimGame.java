import java.util.*;

public class NimGame {
    public static boolean canWinNim(int n) {
        if (n%4==0) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}