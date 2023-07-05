package lista;
import  java.util.*;

public class ex12 {
	public static void main(String[] args) {
		
		int a, n;
		int soma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		a = entrada.nextInt();
		n = entrada.nextInt();
		
		while (n <= 0) {
			n = entrada.nextInt();
		}
		
		for (int i = 1; i <=n; i++) {
			soma = soma + a;
			a++;
		}
		System.out.println(soma);
	}

}
