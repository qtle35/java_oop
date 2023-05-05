package codedevl;

import java.util.Scanner;
import java.util.Stack;

public class TH2_danhsocapngoac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		
		while(t-->0) {
			Stack<Integer> st = new Stack<>();
			String s = sc.nextLine();
			int coun=1;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='(') {
					st.add(coun);
					System.out.print(coun+" ");
					coun++;
				}
				else if(s.charAt(i)==')') {
					System.out.print(st.peek()+" ");
					st.pop();
				}
			}
			System.out.println();
		}
	}
}
