package actividades;

import java.util.Scanner;

public class ActividadesString4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa palabra");
		   String palabra = sc.nextLine();
		   StringBuilder palabraInvertida = new StringBuilder(palabra);
	        
	        palabraInvertida.reverse();
	        
	        System.out.println("La palabra invertida es: " + palabraInvertida.toString());
		

	}

}