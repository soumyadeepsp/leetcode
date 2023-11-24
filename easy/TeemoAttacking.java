import java.util.*;

// Our hero Teemo is attacking an enemy Ashe with poison attacks! When Teemo attacks Ashe,
// Ashe gets poisoned for a exactly duration seconds. More formally, 
// an attack at second t will mean Ashe is poisoned during the inclusive time interval 
// [t, t + duration - 1]. If Teemo attacks again before the poison effect ends, 
// the timer for it is reset, and the poison effect will end duration seconds 
// after the new attack.
// You are given a non-decreasing integer array timeSeries, where timeSeries[i] 
// denotes that Teemo attacks Ashe at second timeSeries[i], and an integer duration.
// Return the total number of seconds that Ashe is poisoned.

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        Arrays.sort(timeSeries);
        int c = 0;
        for (int i=0; i<timeSeries.length-1; i++) {
            if (timeSeries[i]+duration-1 < timeSeries[i+1]) {
                c = c + duration;
            } else {
                c = c + timeSeries[i+1] - timeSeries[i];
            }
        }
        c = c+duration;
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}