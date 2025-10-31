package cartilla;
import java.util.Scanner;

public class ejer_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el capital inicial (X): ");
        double capital = sc.nextDouble();

        System.out.print("Ingrese la tasa de interés (% P): ");
        double tasa = sc.nextDouble() / 100;

        System.out.print("Ingrese el número de períodos (N): ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            double interes = capital * tasa;
            capital += interes;
            System.out.println("Período " + i + ": Interés generado = " + interes + " | Capital acumulado = " + capital);
        }

        sc.close();
    }
}
