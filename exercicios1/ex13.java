package ex;

import java.util.*;

public class ex13 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int vetor[] = new int[3];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = entrada.nextInt();
		}
		
		int maior = vetor[0];
		int menor = vetor[0];
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i]>maior && vetor[i] % 2==0)
				maior = vetor[i];
			if(vetor[i]<menor)
				menor = vetor[i];
		}
		
		if(maior % 2 == 0)
			System.out.println(maior);
		else
			System.out.println(menor);
	}
}
