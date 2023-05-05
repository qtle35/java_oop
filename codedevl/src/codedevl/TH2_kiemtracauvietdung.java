package codedevl;

import java.util.Scanner;
import java.util.Stack;

public class TH2_kiemtracauvietdung {
	public static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(') {
                st.add(s.charAt(i));
            } 
            else if(s.charAt(i)==')') {
            	if(!st.isEmpty() && st.peek()=='(') st.pop();
            	else return false;
            }
            else if(s.charAt(i)==']') {
            	if(!st.isEmpty() && st.peek()=='[') st.pop();
            	else return false;
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
