package actividades;

import java.util.Scanner;

public class ActividadesString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa una cadena de texto:");
		  String texto = sc.nextLine();
		  String nuevoTexto = texto.replace("e", "x");
		  
			  System.out.println(nuevoTexto);
		
	}

}
