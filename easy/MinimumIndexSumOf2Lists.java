import java.util.*;

// Given two arrays of strings list1 and list2, find the common strings with the least index sum.
// A common string is a string that appeared in both list1 and list2.
// A common string with the least index sum is a common string such that if
// it appeared at list1[i] and list2[j] then i + j should be the minimum value
// among all the other common strings.
// Return all the common strings with the least index sum. Return the answer in any order.

public class MinimumIndexSumOf2Lists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i=0; i<list1.length; i++) {
            map1.put(list1[i], i);
        }
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i=0; i<list2.length; i++) {
            map2.put(list2[i], i);
        }
        List<String> ans = new ArrayList<>();
        int max = Integer.MAX_VALUE;
        for (int i=0; i<list1.length; i++) {
            if (map2.containsKey(list1[i])) {
                if (map1.get(list1[i])+map2.get(list1[i]) < max) {
                   max = map1.get(list1[i])+map2.get(list1[i]);
                   ans = new ArrayList<>();
                }
                if (map1.get(list1[i])+map2.get(list1[i]) == max) {
                    ans.add(list1[i]);
                }
            }
        }
        String[] arr = new String[ans.size()];
        for (int i=0; i<arr.length; i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}