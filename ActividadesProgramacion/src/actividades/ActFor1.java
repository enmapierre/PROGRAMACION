package actividades;

import java.util.Scanner;

public class ActFor1 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero");
		int numero = sc.nextInt();
		for (int i=1; i <=numero; i++) {
			System.out.print( i + " ");
		}
	}

}
