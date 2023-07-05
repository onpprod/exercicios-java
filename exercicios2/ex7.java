package lista;
import  java.util.*;

public class ex7 {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		int hour = time / 3600;
		int min = (time % 3600) / 60;
		int seg = ((time % 3600) % 60);
		System.out.format("%d:%d:%d%n", hour, min, seg);

	}

}
