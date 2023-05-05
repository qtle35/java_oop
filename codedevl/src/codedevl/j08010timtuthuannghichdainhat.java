package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class j08010timtuthuannghichdainhat {
	public static Boolean check(String s) {
		int n = s.length();
		for(int i=0;i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-i-1)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, Integer> lkm = new LinkedHashMap<>();
		int h=0;
		while(sc.hasNext()) {
			String s = sc.next();
			if(check(s)) {
				if(lkm.get(s)==null) lkm.put(s, 1);
				else lkm.put(s, lkm.get(s)+1);
				if( s.length()>h) {
					h = s.length();
				}
				
			}
		}
		for(String x: lkm.keySet()) {
			if( x.length()==h) System.out.println(x+" "+lkm.get(x));
		}
	}
}
