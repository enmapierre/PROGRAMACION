package actividades;

import java.util.Scanner;

public class ActSwitch3 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa dinero");
		int numero = sc.nextInt();
			
		switch(numero) {
			case 1 :
				System.out.println("Lunes");
				break;
			
			case 2 :
				System.out.println("Martes");	
				break;
			
			case 3 :
				System.out.println("Miercoles");	
				break;
				
			case 4 :
				System.out.println("Jueves");	
				break;
				
			case 5 :
				System.out.println("Viernes");	
				break;
				
			case 6 :
				System.out.println("Sabado");	
				break;
				
			case 7 :
				System.out.println("Domingo");	
				break;
				
		}
		
	}

}