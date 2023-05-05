package codedevl;

import java.io.*;
import java.util.*;

public class j07001docfile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}
