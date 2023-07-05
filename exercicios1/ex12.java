package ex;

import java.util.*;

public class ex12 {
	
	static public void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int cod = 0;
		int alc = 0;
		int gas = 0;
		int dis = 0;
		
		while(cod != 4) {
			
			System.out.println("Digite um codigo:");
			cod = entrada.nextInt();
			
			switch(cod) {
			case 1: alc++;
			break;
			case 2: gas++;
			break;
			case 3: dis++;
			break;
			case 4: break;
			default: System.out.println("Insira um codigo valido");
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alc);
		System.out.println("Gasolina: "+gas);
		System.out.println("Diesel: "+dis);
		
	}

}
