package ejercicios;

import java.util.Scanner;

public class VariableViajera {

	public static void main(String[] args) 
	{
		int A, B;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Para nuestro intercamio");
		System.out.println("Ingresa un Valor para A");
		 A = teclado.nextInt();
		 
		System.out.println("");
		
		System.out.println("Ingrese un Valor para B");
		 B = teclado.nextInt();
		
		System.out.println("");
		System.out.println("Antes del Intercambio nuestros valores son: ");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		int intercambio = A;
		A = B;
		B = intercambio;
		
		System.out.println("Despues del intercambio");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		 
	}

}
