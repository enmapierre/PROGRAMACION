package actividades;

import java.util.Scanner;

public class Act4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce lado1");
		int lado1= sc.nextInt();
		
		System.out.println("Introduce lado2");
		int lado2= sc.nextInt();
		
		System.out.println("Introduce lado3");
		int lado3= sc.nextInt();
		
		if (lado1 == lado2 && lado1==lado3 && lado2== lado3){
			System.out.println("Tu triangulo es equilatero");
			
		} else if (lado1 == lado2 || lado2 == lado3) {
			System.out.println("Tu triangulo es isosceles");
			
		}else {
			System.out.println("Tu triangulo es escaleno");
		}
	}

}
