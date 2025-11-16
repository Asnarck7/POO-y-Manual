package ejercicios;

// Importamos las librerías Scanner y Random
import java.util.Scanner;
import java.util.Random;

public class Dados {
    public static void main(String[] args) {
        
        System.out.println("🎲 Bienvenido al juego de los DADOS 🎲\n");
        
        Scanner teclado = new Scanner(System.in);
        Random rr = new Random();
        
        // Generamos dos números aleatorios entre 1 y 6 (como dos dados reales)
        int dado1 = rr.nextInt(6) + 1;
        int dado2 = rr.nextInt(6) + 1;
        
        // Sumamos los valores de los dos dados
        int suma = dado1 + dado2;
        
        // Mostramos el resultado al jugador
        System.out.println("El resultado de los dados es: " + dado1 + " y " + dado2 + 
                           " → Total: " + suma + "\n");
        
        // Condición de victoria: si la suma es 7 o 11, el jugador gana
        if (suma == 7 || suma == 11) {
            System.out.println("¡Ganaste! 🎉 Eres un maestro de los dados 😎");
        } else {
            System.out.println("Perdiste 😢 Muy malo manito, vuelve a intentarlo.");
        }
        
        teclado.close(); // Cerramos el scanner para evitar fugas de recursos
    }
}
