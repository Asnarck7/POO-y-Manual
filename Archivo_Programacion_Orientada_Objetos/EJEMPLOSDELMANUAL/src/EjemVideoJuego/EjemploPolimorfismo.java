package EjemVideoJuego;

// Clase base con un método genérico
class PersonajePoli {
    void atacar() {
        System.out.println("El personaje ataca.");
    }
}

// Subclase Guerrero que redefine atacar()
class GuerreroPoli extends PersonajePoli {
    @Override
    void atacar() {
        System.out.println("El guerrero ataca con su espada.");
    }
}

// Subclase Mago que redefine atacar()
class MagoPoli extends PersonajePoli {
    @Override
    void atacar() {
        System.out.println("El mago lanza un hechizo.");
    }
}

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        // Se crean personajes de distinto tipo
        PersonajePoli p1 = new GuerreroPoli();
        PersonajePoli p2 = new MagoPoli();

        // Cada objeto ejecuta atacar() de forma distinta
        p1.atacar(); // Guerrero
        p2.atacar(); // Mago
    }
}

