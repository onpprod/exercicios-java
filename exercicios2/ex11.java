package lista;
import  java.util.*;

public class ex11 {
	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;
		
		while (tipo != 4) {
			tipo = entrada.nextInt();
			if (tipo == 1) {
				alcool++;
			} else if (tipo == 2) {
				gasolina++;
			}else if(tipo == 3) {
				diesel++;
			}
		}
		//switch (tipo) {
		//case 1: alcool++;
		//break;
		//case 2: gasolina++;
		//break;
		//case 3: diesel++;
		//break;

	System.out.println("MUITO OBRIGADO");
	System.out.println("Alcool: " + alcool);
	System.out.println("Gasolina: " + gasolina);
	System.out.println("Diesel: " + diesel);
	
	}

}
