package lista;
import java.util.*;
public class ex6 {
		 public static void main(String[] args) {

		        Scanner entrada = new Scanner(System.in);
		        
		        double x1 = entrada.nextDouble();
		        double y1 = entrada.nextDouble();
		        double x2 = entrada.nextDouble();
		        double y2 = entrada.nextDouble();
		        
		        double content = ((x2 - x1)* (x2 - x1)) +((y2 - y1)*(y2 - y1));
		        double distance = Math.sqrt(content);
		        
		        System.out.printf("%.4f\n",distance);

		    }

}
