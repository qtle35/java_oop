package codedevl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class j07006sokhacnhautrongfile3 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<Integer> l = (ArrayList<Integer>) input.readObject();
		int[] a = new int[1001];
		for(Integer x: l ) a[x]++;
		for(int i=0;i<1000;i++) {
			if(a[i]>0) {
				System.out.println(i + " " + a[i]);
			}
		}
		input.close();
	}
}
