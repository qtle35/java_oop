package codedevl;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class j02006 {
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
		Set<Integer> uni=new TreeSet<Integer>(x);
		uni.addAll(y);
		//System.out.println(inter);
		Iterator<Integer> i= uni.iterator();
		while(i.hasNext()) System.out.print(i.next()+" ");
	}
}
