package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class j03020timtuthuannghichdainhat {
	public static boolean check(String s) {
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, Integer> lm=new  LinkedHashMap<String, Integer>();
		int lenmax=0;
		while(sc.hasNext()) {
			String s=sc.next();
			if(check(s)) {
				
				if(lm.get(s)==null) lm.put(s, 1);
				else lm.put(s, lm.get(s)+1);
				if(s.length()>lenmax) {
					lenmax=s.length();
				}
			}
		}
		for(String i : lm.keySet()) {
			if(i.length()==lenmax) System.out.println(i+" "+lm.get(i));
		}
	}
}
