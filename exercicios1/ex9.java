package ex;

import java.util.Scanner;

public class ex9 {
public static void main(String[] args) {
		
		Scanner entrada2 = new Scanner(System.in);
			
		double a, b, c, media;
		
		System.out.println("Digite sua nota a: ");
		a = entrada2.nextDouble();
		System.out.println("Digite sua nota b: ");
		b = entrada2.nextDouble();
		System.out.println("Digite sua nota c: ");
		c = entrada2.nextDouble();
		
		media = (2*a + 3*b + 5*c)/10;
		
		System.out.println("Media = " + media);
	}

}
