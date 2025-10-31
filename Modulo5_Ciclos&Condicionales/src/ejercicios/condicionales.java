package ejercicios;

import java.util.Scanner;

public class condicionales {

	public static void main(String[] args) 
	{
		//crear objeto scanner para leer desde el teclado
		Scanner sc = new Scanner(System.in);
		
		//pedir valor del usuario
		System.out.println("Ingrese el color de la luz");
		System.out.println("verde o  Rojo");
		String colorLuz = sc.nextLine();//lees el texto que ingresa el usuario
		
		
		if ( colorLuz.equals("verde"))
		{
			System.out.println("puede continuar");
		}else{
			System.out.println("Alto Total");
		}

		sc.close();
		
	}

}
