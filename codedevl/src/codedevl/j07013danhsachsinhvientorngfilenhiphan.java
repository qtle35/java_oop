package codedevl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class j07013danhsachsinhvientorngfilenhiphan {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("SV.in"));
		ArrayList<SinhVien> l = (ArrayList<SinhVien>) in.readObject();
		for(SinhVien x : l) System.out.println(x);
	}
}
