package codedevl;

import java.util.Scanner;

public class j04002khaibaolophcn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectange re= new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
		if (re.getHeight()<=0 || re.getWidth()<=0) System.out.println("INVALID");
		else {
			System.out.printf("%.0f %.0f %s",re.findPerimeter(),re.finaArea(),re.getColor());
		}
	}
}
