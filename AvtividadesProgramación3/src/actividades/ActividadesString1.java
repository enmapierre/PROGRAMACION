package actividades;

import java.util.Scanner;

public class ActividadesString1 {
 
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Ingresa una cadena de texto:");
	        
	        String cadena = sc.nextLine();
	        int contador = 0;
	        
	        for (int i = 0; i < cadena.length(); i++) {
	            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {/*El método charAt(i) en Java devuelve el carácter en la posición i de una cadena de texto*/
	                contador++;
	            }
	        }
	        System.out.println("La letra 'a' aparece " + contador + " veces en la cadena.");
	        
	       
	    }
	}