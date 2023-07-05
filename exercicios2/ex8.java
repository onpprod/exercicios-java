package lista;
import  java.util.*;

public class ex8 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int A, B, C, D;
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		if(B>C && D>A) {
			if((C+D)>(A+B)) {
				if((C*D)>=0) {
					if(A%2==0) {
						System.out.print("Valores aceitos");
					}
				}
			}
			System.exit(0);
		}
		else
			System.out.print("Valores nao aceitos");
		System.exit(0);
	}

}
