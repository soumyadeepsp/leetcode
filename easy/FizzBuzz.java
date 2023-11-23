import java.util.*;

// Given an integer n, return a string array answer (1-indexed) where:
// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>(n);
        for (int i=0; i<n; i++) {
            if ((i+1)%3==0 && (i+1)%5==0) {
                arr.add(i, "FizzBuzz");
            } else if((i+1)%3==0 && (i+1)%5!=0) {
                arr.add(i, "Fizz");
            } else if ((i+1)%3!=0 && (i+1)%5==0) {
                arr.add(i, "Buzz");
            } else {
                arr.add(i, (i+1)+"");
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
