package ex;

import java.util.*;

public class ex14 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int N = entrada.nextInt();
		
		int vetor[] = new int[N];
		int vetorZero[] = new int[N];
		int vetorUm[] = new int[N];
		
		for(int i=0; i<N; i++) {
			vetor[i] = entrada.nextInt();
			vetorZero[i] = 0;
			vetorUm[i] = 1;
		}
		
		int v0=0, v1=0;
		for (int i = 0; i<N;i++) {
			if(vetor[i]!=vetorZero[i])
				v0++;
			
			if(vetor[i]!=vetorUm[i])
				v1++;
		}
		
		if(v0<v1)
			System.out.println(v0);
		else
			System.out.println(v1);
			
	}
}
