package codedevl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TH2_songuyenthuy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			Queue<Long> q = new LinkedList<>();
			q.add((long) 4);
			q.add((long) 5);
			while(n-->0) {
				String x = String.valueOf(q.poll());
				StringBuilder y = new StringBuilder(x);
				String z = y+y.reverse().toString();
				System.out.print(z+" ");
				q.add(Long.parseLong(x+'4'));
				q.add(Long.parseLong(x+'5'));
			}
			System.out.println();
		}
	}
}
