package lista;
import  java.util.*;

public class ex15 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        int y;
        int[] N = new int[20];
        
        for (int i=0; i < N.length; i++) {
            N[i] = entrada.nextInt();
        }
        for (int i=0; i < (N.length / 2); i++) {
        	y = N[i];
        	N[i] = N[N.length - 1- i];
        	N[N.length - 1 -i] = y;
        }
        for (int i=0; i < N.length; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }
    }

}
