import java.util.*;

// Alice has n candies, where the ith candy is of type candyType[i]. 
// Alice noticed that she started to gain weight, so she visited a doctor.
// The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
// Alice likes her candies very much, and she wants to eat the maximum number 
//of different types of candies while still following the doctor's advice.
// Given the integer array candyType of length n, return the maximum number
// of different types of candies she can eat if she only eats n / 2 of them.

public class DistributeCandies {
    public static int distributeCandies(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], 1);
        }
        if (map.size()>=arr.length/2) {
            return arr.length/2;
        } else {
            return map.size();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}