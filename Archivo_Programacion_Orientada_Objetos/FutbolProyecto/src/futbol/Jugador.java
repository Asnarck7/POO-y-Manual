public class Jugador {
    // Atributos
    String nombre;
    int correr;
    int pase;
    int disparo;
    String celebracion;

    // Constructor
    public Jugador(String nombre, int correr, int pase, int disparo, String celebracion) {
        this.nombre = nombre;
        this.correr = correr;
        this.pase = pase;
        this.disparo = disparo;
        this.celebracion = celebracion;
    }

    // Métodos
    public void correr() {
        System.out.println(nombre + " corre con nivel " + correr);
    }

    public void pasarBalon() {
        System.out.println(nombre + " pasa el balón con precisión de " + pase);
    }

    public void disparar() {
        System.out.println(nombre + " dispara con potencia de " + disparo);
    }

    public void celebrar() {
        System.out.println(nombre + " celebra el gol " + celebracion);
    }
}

// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        // Crear un jugador
        Jugador jugador1 = new Jugador("Cristiano", 95, 85, 98, "gritando ¡Siuuuu!");

        // Probar sus métodos
        jugador1.correr();
        jugador1.pasarBalon();
        jugador1.disparar();
        jugador1.celebrar();
    }
}

