package codedevl;

import java.util.Scanner;
import java.util.Vector;

public class j03010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		Vector<String> res2=new Vector<String>();
		while(t-->0) {
			Vector<String> res=new Vector<String>();
			String s=sc.nextLine();
			String[] s1=s.split("\\s+");
			for(String a : s1) {
				if(a.length()>=1) {
					a=a.toLowerCase();
					res.add(a);
				}
			}
			String k="";
			k+=(res.get(res.size()-1));
			for(int i=0;i<res.size()-1;i++) {
				k+=(res.get(i).charAt(0));
			}
			res2.add(k);
		}
		for(int i=0;i<res2.size();i++) {
			int dem=1;
			for(int j=0;j<i;j++) {
				if(res2.get(i).equals(res2.get(j))) dem++;
			}
			System.out.print(res2.get(i));
			if(dem>1) System.out.print(dem);
			System.out.println("@ptit.edu.vn");
		}
		
	}
}
