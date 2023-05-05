package codedevl;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class j03027 {
	static void rutGon(String s) {
        Deque<Character> dq = new LinkedList<>();
        dq.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (dq.isEmpty()) dq.add(s.charAt(i));
            else {
                if (dq.getLast() == s.charAt(i))
                    dq.removeLast();
                else dq.add(s.charAt(i));
            }
        }
        if (dq.isEmpty())
            System.out.println("Empty String");
        while (!dq.isEmpty()) {
            System.out.print(dq.pollFirst());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        String s = sc.next();
        rutGon(s);
    }
}
