package actividades;

public class Act3 {

	public static void main(String[] args) {
		
		int multiplica = 1;
		
		for (int i=1; i<=10; i++) {
			System.out.println( i );
			
			for (int j=1; j<=10; j++) {
			multiplica = i*j;
				System.out.print( multiplica);	
			}
		}	System.out.println();
	}

}
