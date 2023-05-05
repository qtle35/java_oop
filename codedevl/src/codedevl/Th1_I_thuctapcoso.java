package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Th1_I_thuctapcoso {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner readsv = new Scanner(new File("SINHVIEN.in"));
		Scanner readdt = new Scanner(new File("DATA.in"));
		Scanner readnv = new Scanner(new File("DN.in"));
		int t = Integer.parseInt(readsv.nextLine());
		ArrayList<ThucTap> l1 = new ArrayList<ThucTap>();
		for(int i=1;i<=t;i++) {
			ThucTap a = new ThucTap(readsv.nextLine(), readsv.nextLine()
					,readsv.nextLine(),readsv.nextLine());
			l1.add(a);
		}
		t = Integer.parseInt(readdt.nextLine());
		int h=0;
		for(int i=1;i<=t;i++) {
			l1.get(h).setTengv(readdt.nextLine());
			l1.get(h).setTengv(readdt.nextLine());
			l1.get(h).setMadt(String.format("DT%03d", i));
			h++;
		}
		t = readnv.nextInt();
		for(int i=1;i<=t;i++) {
			String s1=readnv.next();
			String s2=readnv.next();
			for(ThucTap x:l1) {
				if(x.getMasv().equals(s1) && x.getMadt().equals(s2)) {
					System.out.println(x);
				}
			}
		}
	}
}
