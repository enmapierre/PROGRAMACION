package actividades;

import java.util.Scanner;
public class Act1 {
	public static void main (String []arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa numero");
		int numero = sc.nextInt();
		int suma = 0;
		
		for (int i=1 ; i<=numero ; i++) {
			if (i %2 == 0) {
				suma = suma + i;
				
			}
		}
		System.out.println(suma);
	}
}