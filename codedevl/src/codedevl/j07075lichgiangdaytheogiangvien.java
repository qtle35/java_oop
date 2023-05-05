package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class j07075lichgiangdaytheogiangvien {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		ArrayList<MonHoc> lmh = new ArrayList<>();
		ArrayList<NhomLopHoc> llh = new ArrayList<>();
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			sc.nextLine();
			lmh.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextInt()));
		}
		sc = new Scanner(new File("LICHGD.in"));
		t = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=t;i++) {
			
			NhomLopHoc a = new NhomLopHoc(sc.nextLine(),Integer.parseInt(sc.nextLine()) , Integer.parseInt(sc.nextLine())
					, sc.nextLine(), sc.nextLine());
			a.setManhom(String.format("HP%03d", i));
			for(MonHoc x: lmh) {
				if(x.getMamon().equals(a.getMamon())) a.setTenmon(x.getTenmon());
			}
			llh.add(a);
		}
		llh.sort(Comparator.comparing(NhomLopHoc::getNgayday)
				.thenComparing(NhomLopHoc::getKiphoc)
				.thenComparing(NhomLopHoc::getTengv));
		String s = sc.nextLine();
		for(NhomLopHoc x: llh) {
			if(x.getTengv().equals(s)) {
				System.out.println("LICH GIANG DAY GIANG VIEN " + x.getTengv()+":");
				break;
			}
		}
		for(NhomLopHoc x:llh) {
			if(x.getTengv().equals(s)) System.out.println(x);
		}
	}
}
