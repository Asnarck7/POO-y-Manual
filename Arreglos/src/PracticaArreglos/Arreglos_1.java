package PracticaArreglos;
public class Arreglos_1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
        System.out.println("Contenido del arreglo 'a':");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        int[] b = {7, 3, 10, 8, 9, 6};
        System.out.println("\nContenido del arreglo 'b':");
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
    }
}
