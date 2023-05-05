package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class TH2_thietlapdiachimail {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DANHSACH.in"));
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		ArrayList<String> l = new ArrayList<>();
		while(sc.hasNextLine()) {
			String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
			String ten = "";
			for(int i=0;i<s.length-1;i++) {
				ten+=s[i]+" ";
			}
			ten+=s[s.length-1];
			hs.add(ten);
		}
		for(String x:hs) {
			String[] s = x.split(" ");
			String temp = s[s.length-1];
			for(int i=0;i<s.length-1;i++) {
				temp+=s[i].charAt(0);
			}
			l.add(temp);
		}
		for(int i=0;i<l.size();i++) {
			int dem=1;
			for(int j=0;j<i;j++) {
				if(l.get(i).equals(l.get(j))) dem++;
			}
			if(dem==1) System.out.print(l.get(i));
			else System.out.print(l.get(i)+dem);
			System.out.println("@ptit.edu.vn");
		}
	}
}
