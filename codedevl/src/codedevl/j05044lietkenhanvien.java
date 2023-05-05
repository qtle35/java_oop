package codedevl;

import java.util.ArrayList;
import java.util.Scanner;

//class nv{
//	private String ten,chucvu,ma;
//	private int lNgay,lThang,tamung,phucap,thuclinh,ngaycong;
//	public nv(String ten,String chucvu, int lNgay,int ngaycong) {
//		super();
//		if(chucvu.equals("GD")) this.phucap=500;
//		else if(chucvu.equals("PGD")) this.phucap=400;
//		else if(chucvu.equals("TP")) this.phucap=300;
//		else if(chucvu.equals("KT")) this.phucap=250;
//		else this.phucap=100;
//		this.ten = ten;
//		this.ngaycong = ngaycong;
//		this.chucvu = chucvu;
//		this.lNgay = lNgay;
//		this.thuclinh=lNgay*ngaycong;
//		if((thuclinh+phucap)*2/3<25000) this.tamung=(int) (Math.round(((double)(thuclinh+phucap)*2/3)/1000)*1000);
//		else this.tamung=25000;
//	}
//	public void setMa(String ma) {
//		this.ma = ma;
//	}
//	
//	public int getThuclinh() {
//		return thuclinh;
//	}
//	
//	public String getChucvu() {
//		return chucvu;
//	}
//	@Override
//	public String toString() {
//		return ma+" "+ten+" "+phucap+" "+thuclinh+" "+tamung+" "+(phucap+thuclinh-tamung);
//	}
//	
//}
public class j05044lietkenhanvien  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		ArrayList<nv> l = new ArrayList<nv>();
		for(int i=1;i<=n;i++) {
			nv a=new nv(sc.nextLine(),sc.nextLine()
					,Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
			a.setMa(String.format("NV%02d", i));
			l.add(a);
		}
		String s=sc.nextLine();
		for(nv x:l) {
			if(x.getChucvu().equals(s)) System.out.println(x);
		}
		
	}
}

