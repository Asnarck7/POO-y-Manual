package UccEjercicio2;
import java.util.Scanner;
public class practica4 {

	public static void main(String[] args) {

				Scanner teclado = new Scanner(System.in);

				System.out.println("Leer nota ? ");
				int n = teclado.nextInt();
				
				if( n >= 0 && n <= 3){
					System.out.println("Malo");
				}
				else if( n >= 4 && n <= 5 ){
					System.out.println("pésimo");
				}
				else if( n >= 6 && n <= 7 ){
					System.out.println("regular");
				}
				else if( n >= 8 && n <= 10 ){
					System.out.println("bueno");
				}
				else{
					System.out.println("Error nota no esta en el rango " + n);
				}

			}

}
