package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class j07046danhsachcutru {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner sc = new Scanner(new File("KHACH.in"));
		ArrayList<khach> l = new ArrayList<khach>();
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=n;i++) {
			khach a=new khach(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
			l.add(a);
			if(i>=10) a.setTt("KH"+i);
			else a.setTt("KH0"+i);
		}
		Collections.sort(l,new Comparator<khach>() {

			@Override
			public int compare(khach o1, khach o2) {
				// TODO Auto-generated method stub
				return o1.getDif()<o2.getDif()?1:-1;
			}
		});
		for(khach x:l) {
			System.out.println(x);
		}
	}
}
