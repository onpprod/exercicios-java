package lista;
import  java.util.*;

public class ex18 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int j = Integer.parseInt(scan.nextLine()) ;
		for(int i=0;i<j;i++) {
			String palavra= scan.nextLine();
			char[] ch = new char[palavra.length()];
			for(int z = 0;z<palavra.length();z++) {
				if(palavra.charAt(z)>64 && palavra.charAt(z)<91 || palavra.charAt(z)>96 && palavra.charAt(z)<123) {
					ch[z] = (char)(palavra.charAt(z) + 3);
				}
				else {
					ch[z] = palavra.charAt(z);
				}
			}
			char[] copia = new char[palavra.length()];
			for(int z = 0;z<palavra.length();z++) {
				copia[z] = ch[palavra.length() - z-1];
			}
			double k = palavra.length()/2;
			for(int z = 0;z<palavra.length();z++) {
				if(z>=k) {
					copia[z] = (char)(copia[z] - 1);
				}
			}
			for(char c: copia) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
