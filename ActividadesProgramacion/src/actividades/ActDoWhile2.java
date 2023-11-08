package actividades;

import java.util.Scanner;

public class ActDoWhile2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa un numero");
		int numero = sc.nextInt();
		int i= 0;
		int suma = 2;
		
		
		do {
			suma += i;
			
			while (i %2==0)
				suma = suma+i;
			 i++;
			} while (numero<=numero);
		
	}

}
