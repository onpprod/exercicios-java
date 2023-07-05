package ex;

import java.util.*;

public class ex11 {
	
	public static void main (String[] args) {
		
		int numero ;
		int resultado = 1;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		
		numero = entrada.nextInt();
		
		if (numero < 0) {
			System.out.println("Numero invalido.");
		}
		else {
			for(int i=1;i<numero+1;i++) {
				resultado = resultado * i;
			}
		}
		System.out.println(numero+"! = "+resultado);
	}
}
