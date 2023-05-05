package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

class SV1 {
	private String maSV, hoTen, lop, email;

	public SV1(String maSV, String hoTen, String lop, String email) {
		super();
		this.maSV = maSV;
		this.hoTen = format(hoTen);
		this.lop = lop;
		this.email = email;
	}

	public String title(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		return sb.toString();
	}

	public String format(String s) {
		StringTokenizer st = new StringTokenizer(s);
		String ans = "";
		while (st.hasMoreTokens()) {
			ans += title(st.nextToken().toLowerCase());
			ans += " ";
		}
		return ans;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return maSV + " " + hoTen + " " + lop + " " + email;
	}

}
public class j07033danhsachsvtrongfile1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<SV1> data = new ArrayList<SV1>();

		while (n-- > 0) {
			data.add(new SV1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
			Collections.sort(data, new Comparator<SV1>() {

				@Override
				public int compare(SV1 o1, SV1 o2) {
					return o1.getMaSV().compareTo(o2.getMaSV());
				}
			});
		}
		for (SV1 i : data) {
			System.out.println(i);
		}
	}
}
