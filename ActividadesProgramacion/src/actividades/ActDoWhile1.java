package actividades;

import java.util.Scanner;

public class ActDoWhile1 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa un numero");
		int numero = sc.nextInt();
		int i =0;
		
		System.out.println("Tabla de multiplicar del " +numero);
		do {
			System.out.println(numero + " x " + i + " = " + (numero * i));
			  i++;
			} while (i <= 10);
	}

}
