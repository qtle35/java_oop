package codedevl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class LoaiPhong implements Comparable{
	private String line,ten;

	public LoaiPhong(String line) {
		super();
		this.line = line;
	}

	public String getTen() {
		String[] s=line.split(" ");
		return s[1];
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return line;
	}
	public int compareTo(Object b) {
		LoaiPhong b1=(LoaiPhong) b;
		return this.getTen().compareTo(b1.getTen());
	}
}
public class j07045loaiphong {
	public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
