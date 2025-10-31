package ejercicios;

import java.util.Scanner;

public class Else_If
{

	public static void main(String[] args) 
	{
		//crear objeto scanner para leer desde el teclado
		Scanner teclado = new Scanner(System.in);
		
		//pedir valor del usuario
		System.out.println("Ingrese el color de la luz");
		System.out.println("verde, amarillo o  Rojo");
		String colorLuz = teclado.nextLine();//lees el texto que ingresa el usuario
		
		
		if ( colorLuz.equals("verde"))
		{
			System.out.println("puede continuar");
		}
		else if(colorLuz.equals("amarillo"))
		{
			System.out.println("Preparece para parar");
		}
		else if(colorLuz.equals("rojo"))
		{
			System.out.println("Alto Total");
		}
		
		else{
			System.out.println("no existe ese color");
		}

		teclado.close();
		
	}

}
