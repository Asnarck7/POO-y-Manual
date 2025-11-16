package PracticaArreglos;
import java.util.Scanner;

public class Arreglos_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] a = new int[10];
        int n, s = 0;

        System.out.print("¿Cuántos elementos desea ingresar? ");
        n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = teclado.nextInt();
        }

        System.out.println("\nElementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
            s = s + a[i];
        }

        System.out.println("\nLa suma de los elementos es: " + s);
        teclado.close();
    }
}
