package codedevl;

import java.util.Scanner;

public class j02035 {
	public static int indexOfSmallest(int[] array){
	    if (array.length == 0)
	        return -1;

	    int index = 0;
	    int min = array[index];

	    for (int i = 1; i < array.length; i++){
	        if (array[i] <= min){
	        min = array[i];
	        index = i;
	        }
	    }
	    return index;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			System.out.println(indexOfSmallest(a));
		}
	}
}
