package lista;
import  java.util.*;

public class ex16 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		x = fibo(x);
		System.out.print(x);
	}
	public static int fibo(int a) {
		if(a==0) {
			return 1;
		}
		else {
			return a*fibo(a-1);
		}
	}

}
