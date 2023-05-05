package codedevl;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SinhVien implements Serializable {
	private String ma, ten, lop;
	private Date ngaysinh;
	private float gpa;
	public SinhVien(int ma, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
		this.ma ="B20DCCN"+ String.format("%03d", ma);
		this.ten = ten;
		this.lop = lop;
		this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return ma + " " + ten + " " + lop +" "+ new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+String.format("%.2f", gpa);
	}
	
	
	
}
