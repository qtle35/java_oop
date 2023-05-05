package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class j07004sokhacnhautrongfile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		TreeMap<Integer,Integer> m = new TreeMap<Integer,Integer>();
		while(sc.hasNext()) {
			int n=Integer.valueOf(sc.next());
			if(m.get(n)==null) m.put(n, 1);
			else m.put(n, m.get(n)+1);
		}
		for(int x:m.keySet()) {
			System.out.println(x+" "+m.get(x));
		}
	}
}
