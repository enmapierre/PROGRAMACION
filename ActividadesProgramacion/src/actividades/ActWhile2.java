package actividades;

import java.util.Scanner;

public class ActWhile2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 10;
		int i=0;
		int resta=0;
		
		while (i<=numero) {
			resta= numero-i;
			System.out.println(resta);
			i++;
			
		}
	}

}