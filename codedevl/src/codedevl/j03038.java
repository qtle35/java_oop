package codedevl;

import java.util.*;

public class j03038 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		Set<String> hset=new HashSet<String>();
		for(int i=0;i<s.length();i++) {
			hset.add(String.valueOf(s.charAt(i)));
		}
		System.out.println(hset.size());
	}
}
