package codedevl;

import java.util.Scanner;
import java.util.Vector;

public class j02017 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Vector<Integer> v=new Vector<Integer>(n);
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			v.add(m);
		}
		for(int i=0;i<v.size()-1;i++) {
			if((v.get(i)+v.get(i+1))%2==0) {
				//System.out.println(v.size());
				v.remove(i);
				v.remove(i);
				i=-1;
			}
		}
		System.out.println(v.size());
	}
}
