package actividades;

import java.util.Scanner;

public class ActividadesString3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa una cadena de texto:");
		  String texto = sc.nextLine();
		  int contador =0;
		  
		  for (int i=0; i< texto.length(); i++) {
			  if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e'|| texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u')
		   contador++;
		  } 
	
		  System.out.println(contador);
	}

}
