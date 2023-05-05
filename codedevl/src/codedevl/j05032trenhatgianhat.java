package codedevl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class nguoi{
	private String ten,ns,ss;

	public nguoi(String ten, String ns) {
		super();
		this.ten = ten;
		this.ns = ns;
		this.ss=ns.substring(5)+ns.substring(3,5)+ns.substring(0,2);
		
	}

	public String getSs() {
		return ss;
	}

	public String getTen() {
		return ten;
	}
	
}
public class j05032trenhatgianhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<nguoi> l = new ArrayList<nguoi>();
		while(n-->0) {
			l.add(new nguoi(sc.next(),sc.next()));
		}
		l.sort(Comparator.comparing(nguoi::getSs));
		System.out.println(l.get(l.size()-1).getTen());
		System.out.println(l.get(0).getTen());
		
	}
}
