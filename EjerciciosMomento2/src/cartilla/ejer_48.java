package cartilla;
import java.util.Scanner;

public class ejer_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de valores N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Valor " + i + ": ");
            double num = sc.nextDouble();

            if (num < 0) {
                System.out.println("Cubo: " + Math.pow(num, 3));
            } else if (num <= 100) {
                System.out.println("Cuadrado: " + Math.pow(num, 2));
            } else if (num <= 1000) {
                System.out.println("Raíz cuadrada: " + Math.sqrt(num));
            } else {
                System.out.println("Fuera de rango (mayor que 1000)");
            }
        }

        sc.close();
    }
}
