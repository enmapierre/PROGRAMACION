package actividades;

import java.util.Scanner;

public class ActWhile1 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero");
		int numero = sc.nextInt();
		int i=1;
		
		while (i<=numero) {
			System.out.println(i);
			i++;
		}
	}

}
