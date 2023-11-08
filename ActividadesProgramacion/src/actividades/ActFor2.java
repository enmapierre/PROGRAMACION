package actividades;

import java.util.Scanner;

public class ActFor2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero");
		
		int numero = sc.nextInt();
		int suma = 0;
		
		//tambien puedes hacerlo asi: 
		//for (int i=2; i <= numero; +2
		for (int i=1; i<=numero; i++) { 
			if (i %2==0);{
				suma = suma +i ;
			}
		}
		System.out.print(suma);
	}
}
