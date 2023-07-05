package ex;

import java.util.*;

public class ex10 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Numero de entradas: ");
		
		int n = entrada.nextInt();
		
		if(n < 1 || n > 100) {
			System.out.println("informe n tal que 1<= n <= 100");
		}
		
		else {
			for(int contador = 0; contador < n; contador++) {
				
				System.out.println(contador);
				
				int numero = entrada.nextInt();
				int div = 0;
				for(int i = 1; i <= numero; i++) {
					if(numero % i == 0) {
						div++;
					}
				}
				if (div == 2) {
					System.out.println(numero+ " e primo");
				}else {
					System.out.println(numero + " nao e primo");
				}
			}
		}
	}

}
