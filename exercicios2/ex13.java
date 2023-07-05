package lista;
import  java.util.*;

public class ex13 {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int x, n, s, i;
    	
		x = input.nextInt();

		while (x > 0) {
			n = input.nextInt();
			s=0;
			for (i=1; i < n+1; i++){
				
				if (n % i == 0) {
					s+=i;
					
				}
			}
			if (s/2 == n) {
				System.out.println(n + " eh perfeito");
			} else {
				System.out.println(n + " nao eh perfeito");
			}
			
			
			x--;
		}
		
    }

}
