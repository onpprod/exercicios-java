package lista;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import  java.util.Scanner; 

public class ex2 {
	public static void main(String[] args) throws IOException {

        double A, B, MEDIA;
        
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        MEDIA = ((3.5*A)+(7.5*B))/11;
        
        BigDecimal bd = new BigDecimal(MEDIA).setScale(1, RoundingMode.HALF_EVEN);

        System.out.printf("MEDIA=%.1f", bd.doubleValue());

    }

}
