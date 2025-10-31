package UccEjercicio2;

public class practica8_clases {

    public static void main(String[] args) {
        // Crear un objeto de la clase X usando el constructor sin parámetros
        X a = new X();

        // Llamar al método imprime() del objeto a
        a.imprime();

        // Mensaje final
        System.out.println("Fin");
    }
}

// Clase X
class X {
    int i = 5;

    // Constructor por defecto
    X() {
        System.out.println("Constructor sin parámetros ejecutado.");
    }

    // Constructor con parámetro
    X(int i) {
        this.i = i;
        System.out.println("Constructor con parámetro ejecutado. Valor de i: " + this.i);
    }

    // Método para imprimir un mensaje
    void imprime() {
        System.out.println("Inicio");
    }
}
