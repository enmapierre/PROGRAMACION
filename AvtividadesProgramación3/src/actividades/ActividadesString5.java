package actividades;

import java.util.Scanner;

public class ActividadesString5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa texto");
		  String texto = sc.nextLine();
		  StringBuilder palabraInvertida= new StringBuilder(texto);
		  palabraInvertida.reverse();
		  
		  for ( int i=0; i<texto.length(); i++) {
			  if (palabraInvertida.toString() == texto) {
				  
				  System.out.println("Tu palabra es palindroma");
				  
			  }else {
				  System.out.println("Tu palabra no es palindroma");
			  }
		  }
		

	}

}
