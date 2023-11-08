package actividades;

import java.util.Scanner;

public class ActividadesString6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa texto");
		  String texto = sc.nextLine();
		 
		System.out.println("Ingrese el caracter a buscar"); 
		  String letra1 = sc.nextLine();
		 
		System.out.println("Ingrese el caracter con el que reemplazarlo"); 
		  String letra2 = sc.nextLine();
		 
		 String texto2 = texto.replace(letra1,letra2);
		 System.out.println(texto2); 	  
		
	}		

}
