
import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] arr, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], i);
        }
        int[] ans = new int[2];
        for (int i=0; i<arr.length; i++) {
            if (map.containsKey(x-arr[i]) && arr[i]!=(x-arr[i])) {
                ans[0] = i;
                ans[1] = map.get(x-arr[i]);
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int target = scan.nextInt();
        int[] ans = twoSum(arr, target);
        for (int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        scan.close();
    }
}