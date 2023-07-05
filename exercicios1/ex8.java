package ex;

import java.util.*;

public class ex8{
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		int resultado;
		
		System.out.println("Digite os Anos: ");
		numero1 = entrada.nextInt();
		System.out.println("Digite os Meses: ");
		numero2 = entrada.nextInt();
		System.out.println("Digite os Dias: ");
		numero3 = entrada.nextInt();
		
		resultado = numero1*365 + numero2*30 + numero3;
		
		System.out.println(resultado);
		
	}
	
}
