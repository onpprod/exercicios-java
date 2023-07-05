package lista;
import  java.util.*;

public class ex14 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        int[] X = new int[10];
        
        for (int i=0; i < X.length; i++) {
            X[i] = entrada.nextInt();
        }
        for (int i=0; i < X.length; i++) {
        	
            if (X[i] <= 0) X[i] = 1;
        }
        for (int i=0; i < X.length; i++) {
        	
            System.out.println("X["+ i +"] = " + X[i]);
        }
	}

}
