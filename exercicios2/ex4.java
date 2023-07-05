package lista;

import java.io.IOException;
import  java.util.Scanner; 

public class ex4 {
	public static void main(String[] args) throws IOException {
		
		Scanner leitor = new Scanner(System.in);
        
		int x = leitor.nextInt();
        double y = leitor.nextDouble();
        double media = x / y;
        
        System.out.println(String.format("%.3f km/l", media));   
    }

}
