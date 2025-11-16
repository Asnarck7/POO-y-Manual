package ejercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int A, B;
		int Valor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Para nuestra calculadora");
		System.out.println("Ingresa un Valor para A");
		 A = teclado.nextInt();
		System.out.println("Ingrese un Valor para B");
		 B = teclado.nextInt();
		
		System.out.println("Operadores +, -, *, /");
		String op = teclado.next();
		
		if (op.equals("+")) 
		{
			Valor = A + B;
			System.out.println("La Suma es: " + Valor);
		}
		else if (op.equals("-")) 
		{
			
			int Valor1 = A - B;
			int Valor2 = B - A;
			System.out.println("La resta es A - B: " + Valor1);
			System.out.println();
			System.out.println("La resta es B - A: " + Valor2);
		}
		else if (op.equals("*")) 
		{
			Valor = A * B;
			System.out.println("La multiplicacion de A y B es: " + Valor);
		}
		else if(op.equals("/")) 
		{
			float ValorDiv = A / B;
			float ValorDiv2 = B / A;
			System.out.println("La division de A y B es: " + ValorDiv);
			System.out.println();
			System.out.println("La division de B y A es: " + ValorDiv2);
		}
		else {
			System.out.println("No sea canson bro no existe ese Operador");
		}
				

	}

}
