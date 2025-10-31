package cartilla;
import java.util.Scanner;

public class ejer_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("El factorial de " + i + " es: " + factorial);
        }

        sc.close();
    }
}
