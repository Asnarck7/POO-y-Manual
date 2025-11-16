package Main;
import java.util.Scanner; // importar la clase Scanner

public class Operador_ternario {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			//Operador ternario
			//IFTTT
			//?
			//expresion1 ? expresion2 : expresion3
			//si expresion 1 = true entonces expresion 2
			//si expresion  1 = false entonces expresion 3
			System.out.println("Ingrese el valor de A: ");
			int A = sc.nextInt();
			
			System.out.println("Ingrese el valor de B: ");
			int B = sc.nextInt();
			
			String mensaje = A > B ? "Es mayor" : "Es menor";
			
			System.out.println(mensaje);
		}

	}

}
