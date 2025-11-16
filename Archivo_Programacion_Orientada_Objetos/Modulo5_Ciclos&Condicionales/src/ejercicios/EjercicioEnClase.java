package ejercicios;

import java.util.Scanner;

public class EjercicioEnClase {

	public static void main(String[] args) 
	{
		//Crear Obj Escaner
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa un valor para A");
		System.out.println("0 al 10");
		int A = teclado.nextInt();
		
		System.out.println("");
		
		System.out.println("Ingrese un valor para B");
		System.out.println("0 al 10");
		int B = teclado.nextInt();
		
		
		if (A > B)
		{
			System.out.println(A + "= A es mayor que B =" + B);
		}
		else if (A < B) 
		{
			System.out.println(A + "= A es menor que B = " + B);
		}
		else if (A == B) 
		{
			System.out.println( A + "= A es un valor igual que B = " + B);
		}
	}

}
