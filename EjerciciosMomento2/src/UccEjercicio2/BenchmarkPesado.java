package UccEjercicio2;

import java.util.ArrayList;
import java.util.Random;

public class BenchmarkPesado {

    public static void main(String[] args) {
        System.out.println("🔥 Iniciando prueba de rendimiento...");

        long inicio = System.currentTimeMillis();

        // 1. Prueba de CPU (operaciones matemáticas pesadas)
        long operaciones = 500_000_000L; // medio billón de operaciones
        double resultado = 0;
        for (long i = 1; i <= operaciones; i++) {
            resultado += Math.sqrt(i) * Math.sin(i);
        }
        System.out.println("✅ CPU test listo. Resultado final: " + resultado);

        // 2. Prueba de Memoria (creación de objetos grandes)
        ArrayList<int[]> lista = new ArrayList<>();
        Random random = new Random();
        try {
            for (int i = 0; i < 2000; i++) { // ajusta este número si quieres más RAM
                int[] bloque = new int[10_000_000]; // ~40MB cada bloque
                for (int j = 0; j < bloque.length; j++) {
                    bloque[j] = random.nextInt();
                }
                lista.add(bloque);
                System.out.println("RAM usada con bloques: " + (i + 1));
            }
        } catch (OutOfMemoryError e) {
            System.out.println("💥 Se agotó la memoria RAM disponible en la JVM.");
        }

        long fin = System.currentTimeMillis();
        System.out.println("⏳ Tiempo total de prueba: " + (fin - inicio) + " ms");
    }
}

