package cartilla;

import java.util.Scanner;

public class ejer_45 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = t.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = t.nextInt();

        if (a > 0 && b > 0) {
            int cantidad = Math.abs(a - b) - 1; // resta absoluta menos los extremos
            if (cantidad < 0) cantidad = 0;     // por si son iguales o consecutivos
            System.out.println("Cantidad de enteros entre " + a + " y " + b + ": " + cantidad);
        } else {
            System.out.println("Ambos numeros deben ser positivos.");
        }

        t.close();
    }
}
