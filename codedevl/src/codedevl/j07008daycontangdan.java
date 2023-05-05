package codedevl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class j07008daycontangdan {
	static int n;
	static int[] a=new int[100],b=new int[100];
	static List<String> l = new ArrayList<String>();
	public static boolean check() {
		int k=0;
		int[] m=new int[100];
		for(int i=1;i<=n;i++) {
			if(b[i]==1) {
				m[k]=a[i];
				k+=1;
			}
		}
		if(k<2) return false;
		for(int i=1;i<k;i++) {
			if(m[i]<m[i-1]) return false;
		}
		return true;
	}
	public static void Try(int i) {
		for(int j=0;j<=1;j++) {
			b[i]=j;
			if(i==n) {
				String s="";
				if( check() ) {
					for(int k=1;k<=n;k++) {
						if(b[k]==1) s+=a[k]+" ";
						
					}
					l.add(s);
				}
				
			}
			else Try(i+1);
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DAYSO.in"));
		n=sc.nextInt();
		int j=1;
		while(sc.hasNext()) {
			a[j]=sc.nextInt();
			j+=1;
		}
		Try(1);
		Collections.sort(l);
		for(String x:l) {
			System.out.println(x);
		}
		
	}
}
