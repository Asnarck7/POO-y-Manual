package EjemVideoJuego;

// Clase abstracta que define un método atacar sin implementarlo
abstract class PersonajeAbs {
    abstract void atacar();
}

// Subclase Arquero que implementa el método atacar
class Arquero extends PersonajeAbs {
    @Override
    void atacar() {
        System.out.println("El arquero dispara una flecha.");
    }
}

// Subclase Mago que implementa el método atacar
class MagoAbs extends PersonajeAbs {
    @Override
    void atacar() {
        System.out.println("El mago lanza un hechizo poderoso.");
    }
}

public class EjemploAbstraccion {
    public static void main(String[] args) {
        // Crear objetos de tipo PersonajeAbs usando las subclases
        PersonajeAbs a = new Arquero();
        PersonajeAbs m = new MagoAbs();

        // Llamar al método atacar de cada objeto
        a.atacar();
        m.atacar();
    }
}
