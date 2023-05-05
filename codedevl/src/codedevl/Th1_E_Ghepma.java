package codedevl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Th1_E_Ghepma {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<String> l1 = (ArrayList<String>) input1.readObject();
		ArrayList<Integer> l2 = (ArrayList<Integer>) input2.readObject();
		TreeSet<String> ts1 = new TreeSet<>();
		TreeSet<Integer> ts2 = new TreeSet<>();
		TreeSet<String> res = new TreeSet<>();
		ts1.addAll(l1);
		ts2.addAll(l2);
		for(String i : ts1) {
			for(Integer j:ts2) {
				res.add(i+j);
			}
			
		}
		for(String i:res) System.out.println(i);
	}
}
