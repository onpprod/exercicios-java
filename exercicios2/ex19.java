package lista;
import  java.util.*;

public class ex19 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String retirarN = scan.next();
		String numero = scan.next();
		String modificada = numero.replace(retirarN, "");
		int j = Integer.parseInt(modificada);
		System.out.print(j);
	}

}
