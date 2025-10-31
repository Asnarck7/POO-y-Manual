package cartilla;
import java.util.Scanner;

public class ejer_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las coordenadas de la emergencia (x y): ");
        double xE = sc.nextDouble();
        double yE = sc.nextDouble();

        System.out.print("Ingrese la cantidad de ambulancias: ");
        int n = sc.nextInt();

        double minDist = Double.MAX_VALUE;
        double ambX = 0, ambY = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Coordenadas de ambulancia " + i + " (x y): ");
            double xA = sc.nextDouble();
            double yA = sc.nextDouble();

            double distancia = Math.sqrt(Math.pow(xE - xA, 2) + Math.pow(yE - yA, 2));

            if (distancia < minDist) {
                minDist = distancia;
                ambX = xA;
                ambY = yA;
            }
        }

        System.out.println("\nLa ambulancia más cercana está en: (" + ambX + ", " + ambY + ")");
        System.out.println("Distancia: " + minDist);
        sc.close();
    }
}
