package ejercicios;
import java.util.Random;
public class BattleRoyale {
    public static void main(String[] args) {
        int n = 10; // número de jugadores
        int[] vida = new int[n]; // arreglo que almacena la vida de cada jugador
        String[] jugadores = new String[n]; // nombres
        Random rand = new Random(); //números aleatorios
        // Inicializar vida y nombres de los jugadores
        for (int i = 0; i < n; i++) {
            vida[i] = 100; //100 de vida
            jugadores[i] = "Jugador " + (i + 1); //nombre
        }
        int turno = 1; //contador de turnos
        // Bucle principal: se repite mientras queden más de un jugador vivo
        while (contarVivos(vida) > 1) {
            System.out.println("Turno " + turno + ":");

            // Cada jugador vivo ataca a otro jugador aleatorio vivo
            for (int i = 0; i < n; i++) {
                if (vida[i] > 0) { // solo jugadores vivos atacan
                    int objetivo;
                    // Seleccionar un objetivo aleatorio que no sea el mismo y que esté vivo
                    do { 
                        objetivo = rand.nextInt(n); 
                    } while (objetivo == i || vida[objetivo] <= 0);
                    
                    // daño aleatorio entre 10 y 30
                    int daño = rand.nextInt(21) + 10; 
                    vida[objetivo] -= daño; 
                    if (vida[objetivo] < 0) vida[objetivo] = 0; // evitar vida negativa

                    // Mostrar acción del turno
                    System.out.println(jugadores[i] + " ataca a " + jugadores[objetivo] + " con " + daño + " de daÑo. Vida restante: " + vida[objetivo]);
                }
            }
            System.out.println(); 
            turno++;
        }
        // mostrar el ganador
        for (int i = 0; i < n; i++)
            if (vida[i] > 0)
                System.out.println("¡El ganador es " + jugadores[i] + " con " + vida[i] + " de vida!");
    }
    // Función que cuenta cuántos jugadores están vivos (vida > 0)
    public static int contarVivos(int[] vida) {
        int c = 0;
        for (int v : vida) if (v > 0) c++;
        return c;
    }
}
