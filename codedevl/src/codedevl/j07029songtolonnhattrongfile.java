package codedevl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class j07029songtolonnhattrongfile {
	public static Boolean check(int n) {
		if(n<2) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<Integer> l = (ArrayList<Integer>) input.readObject();
		TreeMap<Integer, Integer> tm = new TreeMap<>(Collections.reverseOrder());
		for(Integer i : l) {
			if(check(i)) {
				if(tm.get(i)==null) tm.put(i, 1);
				else tm.put(i, tm.get(i)+1);
			}
		}
		int dem=0;
		for(Integer i : tm.keySet()) {
			if(dem==10) break;
			System.out.println(i + " " +tm.get(i));
			dem++;
		}
	}
}

