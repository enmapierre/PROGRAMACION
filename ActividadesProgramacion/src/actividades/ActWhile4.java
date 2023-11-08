package actividades;

import java.util.Scanner;

public class ActWhile4 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Prueba un numero!");
		int m=1;
		int n=100;	
		int pedir=  sc.nextInt();
			
			
		int numero = (int) (Math.floor(Math.random()*(n-m+1)+m));
		
		while (pedir != numero) {
			if (pedir < numero) {
				System.out.println("Mas garnde");
			}
			else if (pedir > numero) {
				System.out.println("Mas pequeño");
			}
			pedir = sc.nextInt();
			
		}
		System.out.println("Has acertado!!");
	}

}
