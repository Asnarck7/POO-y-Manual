package ejercicios;

import java.util.Random;

public class LaVueltaAlMundo {

    public static void main(String[] args) {
        // Número de autos
        int n = 10;

        // Arreglo que representa la posición actual de los autos en la carrera
        int[] posiciones = new int[n]; // todos inician en 0

        // Arreglo que almacena los nombres de los autos
        String[] autos = {"Carro Rojo", "Carro Azul", "Carro Amarillo", "Carro Violeta", "Carro Cafe", "Carro Negro", "Carro Gris",
        					"Carro Lila", "Carro Naranja", "Carro Verde"};

        int meta = 50; // distancia a la meta
        Random rand = new Random(); // objeto Random para generar números aleatorios
        int turno = 1; // contador de turnos

        System.out.println("¡Comienza la carrera entre todos los autos!\n");

        // Bucle principal de la carrera: continúa hasta que algún auto cruce la meta
        boolean carreraActiva = true;
        while (carreraActiva) {
            System.out.println("Turno " + turno + ":");

            for (int i = 0; i < n; i++) {
                int avance = rand.nextInt(10) + 1; // genera un avance aleatorio de 1 a 10
                posiciones[i] += avance;

                if (posiciones[i] > meta) {
                    posiciones[i] = meta; // no sobrepasar la meta
                }

                // Mostrar avance de cada auto
                System.out.println(autos[i] + " avanza " + avance + " posiciones. Total: " + posiciones[i]);

                // Si algún auto llegó a la meta, terminar carrera
                if (posiciones[i] >= meta) {
                    carreraActiva = false;
                }
            }

            System.out.println(); // salto de línea entre turnos
            turno++; // incrementar el turno
        }

        // Determinar ganador (el primero que llegó a la meta)
        for (int i = 0; i < n; i++) {
            if (posiciones[i] >= meta) {
                System.out.println("¡El ganador es " + autos[i] + "!");
                break;
            }
        }
    }
}
