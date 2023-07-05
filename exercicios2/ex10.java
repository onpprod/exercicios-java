package lista;
import  java.util.*;

public class ex10 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int i, j, k;
		for (i = 1; i <= N; i++) {
			j = (int) Math.pow((double) i, 2);
			k = (int) Math.pow((double) i, 3);
			System.out.format("%d %d %d%n", i, j, k);
			j++; 
			k++;
			System.out.format("%d %d %d%n", i, j, k);
		}
	}
}

