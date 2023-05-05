package codedevl;

import java.util.ArrayList;
import java.util.Scanner;

public class j05074diemdanh1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVien> lsv = new ArrayList<>();
		ArrayList<Diemdanh> ldd = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine());
		for(int i=0;i<t;i++) {
			lsv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		while(t-->0) {
			String[] s = sc.nextLine().split(" ");
			Diemdanh a = new Diemdanh(s[0], s[1]);
			for(SinhVien x:lsv) {
				if(x.getMaSv().equals(s[0])) {
					x.setDiemdanh(a);
				}
			}
		}
		String s = sc.next();
		for(SinhVien x:lsv) { 
			if(s.equals(x.getLop())) System.out.println(x);
		
		}
	}
}
