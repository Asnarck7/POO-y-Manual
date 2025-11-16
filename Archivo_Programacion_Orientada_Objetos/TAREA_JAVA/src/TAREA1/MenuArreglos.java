
package TAREA1; 

import java.util.Scanner;

public class MenuArreglos {

    // Método para llenar el arreglo
    public static void llenarArreglo(int[] arreglo, Scanner sc) {
        System.out.println("\n--- Llenar arreglo ---");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el valor #" + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }
        System.out.println("Arreglo llenado correctamente.\n");
    }

    // Método para mostrar el arreglo
    public static void mostrarArreglo(int[] arreglo) {
        System.out.println("\n--- Mostrar arreglo ---");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }
        System.out.println();
    }

    // Método para calcular el promedio
    public static double calcularPromedio(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return (double) suma / arreglo.length;
    }

    // Método para buscar un número
    public static void buscarNumero(int[] arreglo, int numero) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                System.out.println("El número " + numero + " se encuentra en la posición " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El número " + numero + " no se encuentra en el arreglo.");
        }
    }

    // Método principal con el menú
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = sc.nextInt();
        int[] arreglo = new int[tamaño];

        int opcion;
        do {
            System.out.println("\n===== MENÚ DE ARREGLOS =====");
            System.out.println("1. Llenar arreglo");
            System.out.println("2. Mostrar arreglo");
            System.out.println("3. Calcular promedio");
            System.out.println("4. Buscar un número");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    llenarArreglo(arreglo, sc);
                    break;
                case 2:
                    mostrarArreglo(arreglo);
                    break;
                case 3:
                    double promedio = calcularPromedio(arreglo);
                    System.out.println("El promedio de los valores es: " + promedio + "\n");
                    break;
                case 4:
                    System.out.print("Ingrese el número a buscar: ");
                    int numero = sc.nextInt();
                    buscarNumero(arreglo, numero);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.\n");
            }

        } while (opcion != 5);

        sc.close();
    }
}
