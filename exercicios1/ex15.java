package ex;
import java.util.*;

public class ex15 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int[2][2];
		
		for (int i = 0; i < 2; i++) {
		
			for (int j = 0; j < 2; j++) {
		
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		int deter = matriz[0][0]*matriz[1][1] - (matriz[0][1]*matriz[1][0]);
		System.out.println(deter);
	}

}
