package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class monthi{
	private String ma,ten,hthuc;

	public monthi(String ma, String ten, String hthuc) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.hthuc = hthuc;
	}

	public String getMa() {
		return ma;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + hthuc ;
	}
	
}
public class j07058danhsachmonthi {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		int n=Integer.parseInt(sc.nextLine());
		ArrayList<monthi> l = new ArrayList<monthi>();
		for(int i=1;i<=n;i++) {
			l.add(new monthi(sc.nextLine(),sc.nextLine(),sc.nextLine()));
			
		}
		l.sort(Comparator.comparing(monthi::getMa));
		for(monthi x:l) System.out.println(x);
	}
}
