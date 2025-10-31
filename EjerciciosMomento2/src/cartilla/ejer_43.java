package cartilla;
import java.util.Scanner;
public class ejer_43 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad; // cantidad de ternas
        int contador = 0; // cuenta los triángulos rectángulos

        System.out.print("Ingrese la cantidad de ternas: ");
        cantidad = teclado.nextInt();

        // Bucle para leer cada terna
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\nTerna #" + i);
            System.out.print("Ingrese el valor de a: ");
            int a = teclado.nextInt();
            System.out.print("Ingrese el valor de b: ");
            int b = teclado.nextInt();
            System.out.print("Ingrese el valor de c: ");
            int c = teclado.nextInt();
            // Determinar cuál es el mayor (hipotenusa)
            int hip, cat1, cat2;
            if (a >= b && a >= c) {
                hip = a; cat1 = b;cat2 = c;
                
            } else if (b >= a && b >= c) {
                hip = b; cat1 = a; cat2 = c;
                
            } else {
                hip = c; cat1 = a; cat2 = b;
            }
            // Verificar si cumple Pitágoras
            if (cat1 * cat1 + cat2 * cat2 == hip * hip) {
                System.out.println("✅ Es un triángulo rectángulo.");
                contador++;
            } else {
                System.out.println("❌ No es un triángulo rectángulo.");
            }
        }
        System.out.println("\nCantidad total de triángulos rectángulos: " + contador);
        teclado.close();
    }
}
