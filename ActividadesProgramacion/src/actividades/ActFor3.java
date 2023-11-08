package actividades;

import java.util.Scanner;

public class ActFor3 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero");
		int numero = sc.nextInt();
		
		System.out.println("Tabla de multiplicar del " +numero);
		for (int i=1; i<=10; i++) {
			System.out.println(i + " x " + numero + " = " + (numero * i));
		}
	}

}
