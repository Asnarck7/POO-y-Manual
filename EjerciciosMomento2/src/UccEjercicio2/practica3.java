package UccEjercicio2;
import java.util.Scanner;
public class practica3 {

	public static void main(String[] args) {
		/*
		Programa para leer un valor, y decir que dia de la semana es 
		*/

				Scanner teclado = new Scanner(System.in);

				System.out.println("Leer dia ? ");
				int n = teclado.nextInt();

				if( n == 1 ) {
					System.out.println("if Lunes " + n );
				}
				else if( n == 2 ) {
					System.out.println("if Martes " + n );
				}
				else if( n == 3 ) {
					System.out.println("if Miercoles " + n );
				}
				else if( n == 4 ) {
					System.out.println("if Jueves " + n );
				}
				else{
					System.out.println("if Error en dia " + n );
				}
				
				switch(n){
				case 1: System.out.println("sw Lunes " + n ); break;
				case 2: System.out.println("sw Martes " + n ); break;
				case 3: System.out.println("sw Miercoles " + n ); break;
				case 4: System.out.println("sw Jueves " + n ); break;
				default: System.out.println("sw Error en dia " + n ); 
				
			}

		}
	}
