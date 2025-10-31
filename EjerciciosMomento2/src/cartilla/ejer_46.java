package cartilla;
import java.util.Scanner;

public class ejer_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador = 0;

        System.out.print("Ingrese la cantidad de puntos: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Punto " + i + " (x y): ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (x > 0 && y > 0) {
                contador++;
                System.out.println("→ El punto " + i + " está en el primer cuadrante.");
            }
        }

        System.out.println("\nTotal de puntos en el primer cuadrante: " + contador);
        sc.close();
    }
}
