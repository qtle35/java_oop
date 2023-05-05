package codedevl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class j05071tinhcuocdienthoai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ThanhPho> ltp = new ArrayList<>();
		int t = sc.nextInt();
		ArrayList<CuocGoi> lcg = new ArrayList<>();
		for(int i=0;i<t;i++) {
			sc.nextLine();
			ltp.add(new ThanhPho(sc.nextLine(), sc.nextLine(), sc.nextInt()));
		}
		t = sc.nextInt();
		for(int i=0;i<t;i++) {
			String s = sc.next();
			CuocGoi a = new CuocGoi(s, sc.next(), sc.next());
			if(s.charAt(0)=='0') {
				for(ThanhPho x:ltp) {
					if(x.getMa().equals(s.substring(1,3))) {
						a.setThanhPho(x);
						a.setGiacuoc(a.getDiff()*x.getGiacuoc());
						lcg.add(a);
					}
				}
			}
			else {
				ThanhPho b = new ThanhPho(s, "Noi mang", 800);
				a.setThanhPho(b);
				a.setDiff( (long) Math.ceil((double)a.getDiff()/3));
				a.setGiacuoc(a.getDiff()*800);
				lcg.add(a);
			}
		}
		lcg.sort(Comparator.comparing(CuocGoi::getGiacuoc).reversed());
		for(CuocGoi x: lcg) System.out.println(x);
	}
}
