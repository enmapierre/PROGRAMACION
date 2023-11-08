package actividades;

import java.util.Scanner;

public class ActSwitch2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa 1º numero");
		int numero = sc.nextInt();
		System.out.println("Ingresa 2º numero");
		int numero2 = sc.nextInt();
		System.out.println("Ingrese el operador");
        char operador = sc.next().charAt(0);
        int resultado= 0;
		 
		switch(operador) {
			case '+' :
				resultado = numero + numero2;
				break;
			
			case '-' :
				resultado = numero - numero2;	
				break;
			
			case '*' :
				resultado = numero * numero2;	
				break;
				
			case '/':
				resultado = numero / numero2;	
				break;
				
			
		}
		System.out.println("El resultado es: " + resultado);

	}

}