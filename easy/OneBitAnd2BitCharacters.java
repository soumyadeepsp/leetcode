import java.util.*;

// We have two special characters:
// The first character can be represented by one bit 0.
// The second character can be represented by two bits (10 or 11).
// Given a binary array bits that ends with 0, return true 
// if the last character must be a one-bit character.

public class OneBitAnd2BitCharacters {
    public static boolean isOneBitCharacter(int[] bits) {
        int p = 0;
        while (p<bits.length) {
            if (p==bits.length-1) {
                return true;
            }
            if (bits[p]==0) {
                ++p;
            } else {
                p = p+2;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}