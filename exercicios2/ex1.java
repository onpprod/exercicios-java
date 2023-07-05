package lista;

import java.util.*;

public class ex1 {
	public static void main (String[] args) {
		double raio, area;
		
		Scanner entrada = new Scanner(System.in);
		raio =  entrada.nextDouble();
		area = 3.14159 * (raio * raio);
	 
	    System.out.printf("A=%.4f\n", area);

	}
}
