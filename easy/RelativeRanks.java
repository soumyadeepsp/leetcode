import java.util.*;

// You are given an integer array score of size n, where score[i] is the score 
// of the ith athlete in a competition. All the scores are guaranteed to be unique.
// The athletes are placed based on their scores, where the 1st place athlete 
// has the highest score, the 2nd place athlete has the 2nd highest score, 
// and so on. The placement of each athlete determines their rank:
// The 1st place athlete's rank is "Gold Medal".
// The 2nd place athlete's rank is "Silver Medal".
// The 3rd place athlete's rank is "Bronze Medal".
// For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
// Return an array answer of size n where answer[i] is the rank of the ith athlete.

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for (int i=0; i<score.length; i++) {
            map.put(score[i], i);
            pq.add(score[i]);
        }
        int c = 1;
        while (!pq.isEmpty()) {
            int sc = pq.poll();
            if (c==1) {
                ans[map.get(sc)] = "Gold Medal";
            } else if (c==2) {
                ans[map.get(sc)] = "Silver Medal";
            } else if (c==3) {
                ans[map.get(sc)] = "Bronze Medal";
            } else {
                ans[map.get(sc)] = c+"";
            }
            ++c;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}