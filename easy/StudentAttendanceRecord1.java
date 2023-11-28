import java.util.Scanner;

// You are given a string s representing an attendance record for a student 
// where each character signifies whether the student was absent, late, or present 
// on that day. The record only contains the following three characters:
// 'A': Absent.
// 'L': Late.
// 'P': Present.
// The student is eligible for an attendance award if they meet both of the following criteria:
// The student was absent ('A') for strictly fewer than 2 days total.
// The student was never late ('L') for 3 or more consecutive days.
// Return true if the student is eligible for an attendance award, or false otherwise.

public class StudentAttendanceRecord1 {
    public static boolean checkRecord(String s) {
        int c = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='A') {
                ++c;
            }
        }
        if (c>=2) {
            return false;
        }
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='L') {
                c = 1;
                for (int j=i+1; j<s.length(); j++) {
                    if (s.charAt(j)=='L') {
                        ++c;
                    } else {
                        break;
                    }
                }
                if (c>=3) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
