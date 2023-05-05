package codedevl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class j05069caulacbobongda1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<CauLacBo> lclb = new ArrayList<>();
		ArrayList<TranDau> ltd = new ArrayList<>();
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			sc.nextLine();
			lclb.add(new CauLacBo(sc.nextLine(), sc.nextLine(), sc.nextLong()));
		}
		t = sc.nextInt();
		for(int i=0;i<t;i++) {
			String s = sc.next();
			long k = sc.nextLong();
			TranDau a = new TranDau(s,k);
			for(CauLacBo x:lclb) {
				if(s.substring(1,3).equals(x.getMaCLB())) {
					a.setCauLacBo(x);
					ltd.add(a);
				}
			}
		}
		ltd.sort(Comparator.comparing(TranDau::getDoanhthu).reversed()
				.thenComparing(TranDau::getTen));
		for(TranDau x: ltd) System.out.println(x);
	}
}
