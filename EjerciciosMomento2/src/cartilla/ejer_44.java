package cartilla;

import java.util.Scanner;

public class ejer_44 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n, eq = 0, iso = 0, esc = 0;

        System.out.print("Cuantas ternas desea ingresar? ");
        n = t.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTerna #" + i);
            int a = t.nextInt(), b = t.nextInt(), c = t.nextInt();

            if (a + b > c && a + c > b && b + c > a) {
                if (a == b && b == c) eq++;
                else if (a == b || a == c || b == c) iso++;
                else esc++;
            } else {
                System.out.println("No forman un triangulo valido.");
            }
        }

        System.out.println("\nEquilateros: " + eq);
        System.out.println("Isosceles: " + iso);
        System.out.println("Escalenos: " + esc);

        t.close();
    }
}
