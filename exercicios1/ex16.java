package ex;

public class ex16 {
	public static void main(String[] args) {
		
		String string = "Curso de Programacao Android - Introducao ao Java";
		System.out.println("Tamanho: "+string.length());
		System.out.println(string.toLowerCase());
		System.out.println(string.replace(" ",""));
		String palavras[] = string.split(" ");
		
		for (int i = palavras.length-1; i >= 0; i--) {
			System.out.print(palavras[i]+" ");
		}
		
	}


}
