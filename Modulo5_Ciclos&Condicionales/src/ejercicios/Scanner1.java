package ejercicios;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cual es su nombre ?");
		String nombre = teclado.nextLine();
		
		System.out.printf("%s, Cual es tu edad?  \n", nombre);
		int edad = teclado.nextInt();
		
		if (edad < 18)
		{
			System.out.println("Eres Menor de edad");
		}
		else {
			System.out.println("Usted es Mayor de edad");
		}
	}

}
