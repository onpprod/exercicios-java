package lista;
import  java.util.*;

public class ex20 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int j = Integer.parseInt(scan.nextLine());
		for(int i=0;i<j;i++) {
			String palavra = scan.nextLine();
			//System.out.println();
			int deslocamento = Integer.parseInt(scan.nextLine());
			char[] ch = new char[palavra.length()];
			for(int z = 0;z<palavra.length();z++) {
				if(palavra.charAt(z)- deslocamento>64) {
					ch[z] = (char)(palavra.charAt(z) - deslocamento);
				}
				else {
					int aux =26+ (palavra.charAt(z)- deslocamento) ;
					ch[z] = (char)(aux);
				}
			}
			for(char c: ch) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
