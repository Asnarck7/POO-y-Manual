package PracticaArreglos;

import java.util.Scanner;

public class Arreglos_3 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int[] a = new int[10];

            System.out.print("¿Cuántos elementos desea ingresar? ");
            int n = teclado.nextInt();

            // Control para que n no sea mayor al tamaño del arreglo
            if (n > a.length) {
                System.out.println("El número máximo de elementos es " + a.length);
                n = a.length;
            }

            // Ingreso de elementos
            for (int i = 0; i < n; i++) {
                System.out.print("a[" + i + "] = ");
                a[i] = teclado.nextInt();
            }

            // Invertir arreglo
            int i = 0, j = n - 1;
            while (i < j) {
                int aux = a[i];
                a[i] = a[j];
                a[j] = aux;
                i++;
                j--;
            }

            // Imprimir arreglo invertido
            System.out.println("Arreglo invertido:");
            for (i = 0; i < n; i++) {
                System.out.printf("a[%d] = %d\n", i, a[i]);
            }
        }
    }
}



