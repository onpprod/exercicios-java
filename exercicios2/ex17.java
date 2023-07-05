package lista;
import  java.util.*;

public class ex17 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int[] k = new int[r];
		for(int i=0;i<r;i++) {
			int j = scan.nextInt();
			k[i] = j;
		}
		int menor = k[0],pos=0;
		for(int i=0;i<r;i++) {
			if(menor>k[i]) {
				menor = k[i];
				pos = i;
			}
		}
		System.out.print("menor valor: "+menor +"\nposição: "+ pos);
	} 

}
