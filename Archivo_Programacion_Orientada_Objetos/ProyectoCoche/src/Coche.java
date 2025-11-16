public class Coche {
    // Atributos
    String marca;
    String color;
    int velocidad;

    // Constructor
    public Coche(String marca, String color) {
        this.marca = marca;
        this.color = color;
        this.velocidad = 0; // velocidad inicial
    }

    // Métodos
    public void arrancar() {
        System.out.println("El coche ha arrancado.");
    }

    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println("El coche ahora va a " + velocidad + " km/h.");
    }

    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) velocidad = 0;
        System.out.println("El coche ahora va a " + velocidad + " km/h.");
    }
}
