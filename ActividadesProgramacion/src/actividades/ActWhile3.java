package actividades;

import java.util.Scanner;

public class ActWhile3 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero");
		int numero=  sc.nextInt();
		int contador=0;
		
		while (numero>0){
			numero= numero/10;
			contador++;	
		}
		System.out.println(contador);
	}
}
