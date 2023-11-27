

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInteger(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        int n = 0;
        for (int i=0; i<s.length(); i++) {
            if (i<s.length()-1 && map.containsKey(s.substring(i, i+2))) {
                n = n + map.get(s.substring(i, i+2));
                i = i+1;
            } else {
                n = n + map.get(s.substring(i, i+1));
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(romanToInteger(s));
        scan.close();
    }
}