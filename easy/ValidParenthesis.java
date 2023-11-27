

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean validParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c=='[' || c=='{' || c=='(') {
                st.add(c);
            } else {
                if (c==']' && !st.isEmpty() && st.peek()=='[') {
                    st.pop();
                } else if (c=='}' && !st.isEmpty() && st.peek()=='{') {
                    st.pop();
                } else if (c==')' && !st.isEmpty() && st.peek()=='(') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(validParenthesis(s));
        scan.close();
    }
}
