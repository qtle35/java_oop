package codedevl;

import java.util.Scanner;

public class j01010 {
	public static void main(String[] args) {
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			long res=0;
			int check=1;
			String s=sc.nextLine();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='0'||s.charAt(i)=='8'||s.charAt(i)=='9') {
					res=res*10+0;
				}
				else if(s.charAt(i)=='1') res=res*10+1;
				else {
					System.out.println("INVALID");
					check=0;
					break;
				}
			}
			if(check==1&&res!=0) System.out.println(res);
			else if(res==0&&check==1) System.out.println("INVALID");
		}
	}
}
