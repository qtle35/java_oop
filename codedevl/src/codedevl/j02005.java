package codedevl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class j02005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int t;
		Set<Integer> x=new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			x.add(t);
		}
		Set<Integer> y=new TreeSet<Integer>();
		for (int i = 0; i < m; i++) {
			t = sc.nextInt();
			y.add(t);
		}
		Set<Integer> inter=new TreeSet<Integer>(x);
		inter.retainAll(y);
		//System.out.println(inter);
		Iterator<Integer> i= inter.iterator();
		while(i.hasNext()) System.out.print(i.next()+" ");
	}
}
