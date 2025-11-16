package UccEjercicio2;

import java.util.Scanner;

public class practica2 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner( System.in);
		
		System.out.println("Ingresar Numero");
		
		int n = teclado.nextInt();
		int r = n % 2;
		if(r == 0)
		{
			System.out.printf("el numero %d es par\n", n);
		}
		else 
		{
			System.out.printf("el numero %d es impar\n", n);
		}
		switch( r ){
		case 0: System.out.printf("el numero %d es par con switch\n", n ); break;
		case 1: System.out.printf("el numero %d es impar con switch\n", n ); break;
		default: System.out.println("Error");
		}
	}

}
