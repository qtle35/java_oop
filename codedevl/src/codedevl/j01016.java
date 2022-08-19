package codedevl;

import java.util.Scanner;

public class j01016 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int x=0,y=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='4') x++;
			else if(s.charAt(i)=='7') y++;
		}
		if(x+y==7||x+y==4) System.out.println("YES");
		else System.out.println("NO");
	}
}
