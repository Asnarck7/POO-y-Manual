package ejercicios1ImpresionInterfaz;

public class PruebaVarios {
    public static void main(String[] args) {
        Varios v = new Varios();

        v.Mensaje("Hola mundo cruel");

        int a = v.leerEntero("Ingresa a = ");
        double b = v.leerDecimal("Ingresa b = ");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        double suma = a + b;
        System.out.println("La suma de los dos números es: " + suma);
    }
}
