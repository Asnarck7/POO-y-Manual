package UccEjercicio2;

public class practica7 {

    public static void main(String[] args) {
        // ---------------------------
        // Ejemplo 1: Uso básico del while
        // ---------------------------

        int contador = 1;

        // Este bucle imprime un mensaje 10 veces
        while (contador <= 10) {
            System.out.println(contador + " Esto es un SPAM BRO!");
            contador++; 

        // ---------------------------
        // Ejemplo 2: Contar los dígitos de un número
        // ---------------------------

        int numero = 123456789;
        int contador1 = 0;
        while (numero > 0) {
            numero = numero / 10; 
            contador1++;          
        }

        // Muestra el número total de dígitos
        System.out.println(">> El numero posee " + contador1 + " digitos.");
        }
    }
}


