package codedevl;

import java.util.ArrayList;
import java.util.Scanner;

public class Th1_G_Danhsachthiicpc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<ThiSinh> l = new ArrayList<ThiSinh>();
		
		for(int i=1;i<=2*t;i++) {
			ThiSinh a = new ThiSinh();
			a.setMateam(String.format("Team%02d", i/2));
			a.setTenteam(sc.nextLine());
			a.setTentruong(sc.nextLine());
			l.add(a);
		}
		t = Integer.parseInt(sc.nextLine());
		for(int i=1;i<=t;i++) {
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
		}
	}
}
