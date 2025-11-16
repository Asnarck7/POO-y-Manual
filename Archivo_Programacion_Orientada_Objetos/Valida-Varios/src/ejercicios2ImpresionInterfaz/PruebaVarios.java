package ejercicios2ImpresionInterfaz;

public class PruebaVarios {
    public static void main(String[] args) {

        Varios v = new Varios();

        v.Mensaje("Hola mundo cruel");

        int a = v.leerEntero("Ingresa a = ");
        v.Mensaje("Número leído: " + a);

        double b = v.leerDecimal("Ingresa b = ");
        v.Mensaje("Número leído: " + b);

        String nombre = v.leerCadena("Ingrese su nombre: ");
        v.Mensaje("Hola " + nombre);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Nombre = " + nombre);

        double suma = a + b;
        v.Mensaje("La suma de los dos números es: " + suma);
    }
}
