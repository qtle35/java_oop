package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class mathang1{
	private String ma,ten,nhom;
	private double mua,ban,ln;
	public mathang1( String ten, String nhom, double mua, double ban) {
		super();
		this.ten = ten;
		this.nhom = nhom;
		this.mua = mua;
		this.ban = ban;
	}
	public double getLn() {
		return ln;
	}
	public void setLn(double ln) {
		this.ln = ln;
	}
	public double getMua() {
		return mua;
	}
	public double getBan() {
		return ban;
	}
	@Override
	public String toString() {
		return ma + " " + ten + " " + nhom + " "+String.format("%.2f", ln);
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	
}
public class j07050sapxepmathang {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MATHANG.in"));
		ArrayList<mathang1> l = new ArrayList<mathang1>();
		int t=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=t;i++) {
			mathang1 a=new mathang1(sc.nextLine(),sc.nextLine(),
					Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
			if(i>=10) a.setMa("MH"+i);
			else a.setMa("MH0"+i);
			a.setLn(a.getBan()-a.getMua());
			l.add(a);
			
		}
		Collections.sort(l,new Comparator<mathang1>() {

			@Override
			public int compare(mathang1 o1, mathang1 o2) {
				// TODO Auto-generated method stub
				return o1.getLn()<o2.getLn()?1:-1;
			}
		});
		for(mathang1 x:l) {
			System.out.println(x);
		}
	}
}
