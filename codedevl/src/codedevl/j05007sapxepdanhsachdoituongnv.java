package codedevl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Nhanvien{
	private String name,sex,birth,address,number,hd,ma,comp;

	public Nhanvien(String name, String sex, String birth, String address, String number, String hd) {
		super();
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.address = address;
		this.number = number;
		this.hd = hd;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}
	
	public String getComp() {
		comp=birth.substring(6)+birth.substring(3,5)+birth.substring(0,3);
		return comp;
	}

	@Override
	public String toString() {
		return ma+" "+ name + " " + sex + " " + birth + " " + address + " "
				+ number + " " + hd;
	}
	
	
}
public class j05007sapxepdanhsachdoituongnv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		ArrayList<Nhanvien> l = new ArrayList<Nhanvien>();
		for(int i=1;i<=n;i++) {
			Nhanvien a=new Nhanvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
			a.setMa(String.format("%05d", i));
			l.add(a);
		}
		l.sort(Comparator.comparing(Nhanvien::getComp));
		for(Nhanvien x:l) System.out.println(x);
		
	}
}


