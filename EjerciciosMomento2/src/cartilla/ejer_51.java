package cartilla;
import java.util.Scanner;

public class ejer_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        int A = sc.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int B = sc.nextInt();

        int resultado = 1; // Para almacenar el valor de A^B

        // Repetir B veces la multiplicación (hecha solo con sumas)
        for (int i = 1; i <= B; i++) {
            int acumulador = 0;
            for (int j = 1; j <= A; j++) {
                acumulador += resultado; // Multiplica usando sumas
            }
            resultado = acumulador;
        }

        System.out.println("El resultado de " + A + "^" + B + " es: " + resultado);
        sc.close();
    }
}
