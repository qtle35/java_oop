package codedevl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class j05005xephangvandongvien1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<VanDongVien> lvdv = new ArrayList<VanDongVien>();
		for(int i=1;i<=t;i++) {
			lvdv.add(new VanDongVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		ArrayList<VanDongVien> res = new ArrayList<>(lvdv);
		lvdv.sort(Comparator.comparing(VanDongVien::getRes));
		int h=1;
		lvdv.get(0).setRank(1);
		for(int i=1;i<lvdv.size();i++) {
			if(lvdv.get(i).getRes() == lvdv.get(i-1).getRes()) {
				lvdv.get(i).setRank(lvdv.get(i-1).getRank());
			}
			else {
				lvdv.get(i).setRank(i+1);
			}
			
		}
		for(VanDongVien x: res) System.out.println(x);
	}
}
