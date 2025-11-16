package cartilla;
import java.util.Scanner;

public class ejer_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de N: ");
        int N = sc.nextInt();

        int cuadrado = 0;  // Guardará el cuadrado actual
        int impar = 1;     // Primer número impar

        System.out.println("Numero\tCuadrado\tMetodo");

        for (int i = 1; i <= N; i++) {
            cuadrado += impar; // Sumar el número impar correspondiente
            System.out.print(i + "\t" + cuadrado + "\t\t");

            // Mostrar el método (por ejemplo: 1 + 3 + 5 ...)
            for (int j = 1; j <= i; j++) {
                System.out.print((2 * j - 1));
                if (j < i) System.out.print(" + ");
            }
            System.out.println();

            impar += 2; // Pasar al siguiente número impar
        }

        sc.close();
    }
}
