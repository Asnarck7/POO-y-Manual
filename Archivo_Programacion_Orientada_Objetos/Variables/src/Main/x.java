package ejercicios;
 
import java.util.Scanner;
import java.util.Random;
public class PiedraPapelTijera {
	public static void main(String[] args) {
    	System.out.println("🎮 Bienvenido al juego de Piedra, Papel o Tijeras 🎮\n");
    	Scanner teclado = new Scanner(System.in);
    	Random rr = new Random();
    	// Pedir al jugador que ingrese su opción
    	System.out.println("Escribe una opción: piedra, papel o tijeras");
    	String jugador = teclado.nextLine().toLowerCase(); // Convertir a minúscula para evitar errores
    	String maquina = ""; // variable para la opción de la máquina
    	// Generar opción aleatoria para la máquina (0 = piedra, 1 = papel, 2 = tijeras)
    	int opmaquina = rr.nextInt(3);
    	if(opmaquina == 0) {
        	maquina = "piedra";
    	} else if(opmaquina == 1) {
        	maquina = "papel";
    	} else {
        	maquina = "tijeras";
    	}
    	System.out.println("La máquina eligió: " + maquina + "\n");
    	// Comparar opciones y determinar el ganador
    	if(jugador.equals(maquina)) {
        	System.out.println("¡Empate! 🤝\n");
    	} else if (
        	(jugador.equals("piedra") && maquina.equals("tijeras")) ||
        	(jugador.equals("tijeras") && maquina.equals("papel")) ||
        	(jugador.equals("papel") && maquina.equals("piedra"))
    	) {
        	System.out.println("¡El jugador es el ganador! 🎉");
    	} else {
        	System.out.println("El jugador ha perdido 😢");
    	}
    	teclado.close(); // Cerrar el scanner
	}
}
