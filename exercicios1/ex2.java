package ex;

public class ex2 {
	public static void main(String[] args) {
		double a = 10;
		double b = 20.1;
		double c = 5.1;
		double delta = (b*b) - (4*a*c);
		double x1 = (- b + Math.sqrt(delta))/(2 * a);
		double x2 = (- b - Math.sqrt(delta))/( 2 * a);
		System.out.println("Valor Delta: "+delta+"\nR1: "+x1+"\nR2: "+x2);
		}

}
