//package codedevl;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class tt{
//	private String name;
//	private int dung,submit;
//	public tt(String name, int dung, int submit) {
//		super();
//		this.name = name;
//		this.dung = dung;
//		this.submit = submit;
//	}
//	public String getName() {
//		return name;
//	}
//	public int getDung() {
//		return dung;
//	}
//	public int getSubmit() {
//		return submit;
//	}
//	@Override
//	public String toString() {
//		return name+" "+dung+" "+submit;
//	}
//	
//}
//public class j05042bangxephang {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		ArrayList<tt> l = new ArrayList<tt>();
//		for(int i=1;i<=n;i++) {
//			sc.nextLine();
//			l.add(new tt(sc.nextLine(),sc.nextInt(),sc.nextInt()));
//		}
//		l.sort(Comparator.comparing(tt::getDung).reversed()
//				.thenComparing(tt::getSubmit)
//				.thenComparing(tt::getName));
//		for(tt x:l) System.out.println(x);
//	}
//}
