package actividades;

import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
	int numero = sc.nextInt();
	
		
		for (int i=1; i<=numero; i++) {
	
			for (int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}


