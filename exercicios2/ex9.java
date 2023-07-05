package lista;
import  java.util.*;

public class ex9 {
	public static boolean noIntervalo(float x, int a, int b) {
		return (x > a) && (x <= b);
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		float x = input.nextFloat();
		if(noIntervalo(x, 0, 25))
			System.out.println("Intervalo [0,25]");
		else if(noIntervalo(x, 25, 50))
			System.out.println("Intervalo (25,50]");
		else if(noIntervalo(x, 50, 75))
			System.out.println("Intervalo (50,75]");
		else if(noIntervalo(x, 75, 100))
			System.out.println("Intervalo (75,100]");
		else
			System.out.println("Fora de intervalo");
	}

}
