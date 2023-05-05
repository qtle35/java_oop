package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class monhoc{
	private String ma,ten,tinchi;
	public monhoc(String ma, String ten, String tinchi) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.tinchi = tinchi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	@Override
	public String toString() {
		return ma + " " + ten + " " + tinchi;
	}
	
}
public class j07034danhsachmonhoc {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList<monhoc> l = new ArrayList<monhoc>();
		while(n-->0) {
			l.add(new monhoc(sc.nextLine(),sc.nextLine(),sc.nextLine()));
		}
		Collections.sort(l,new Comparator<monhoc>() {

			@Override
			public int compare(monhoc o1, monhoc o2) {
				// TODO Auto-generated method stub
				return o1.getTen().compareTo(o2.getTen());
			}
			
		});
		for(monhoc x:l) {
			System.out.println(x);
		}
	}
}
