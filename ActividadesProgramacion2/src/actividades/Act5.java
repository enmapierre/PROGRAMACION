package actividades;

import java.util.Scanner;

public class Act5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce nº1");
		int num1= sc.nextInt();
		
		System.out.println("Introduce nº2");
		int num2= sc.nextInt();
		
		System.out.println("Introduce nº3");
		int num3= sc.nextInt();
		
		if (num1 > num2 && num1>num3) {
			System.out.println(num1);
		}
		else if (num2>num1 && num2 >num3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}

	}

}
