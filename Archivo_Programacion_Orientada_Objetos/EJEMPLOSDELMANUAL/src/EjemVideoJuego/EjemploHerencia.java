package EjemVideoJuego;

// Clase base con atributos generales
class PersonajeBase {
    String nombre;
    int vida;
}

// Subclase que hereda de PersonajeBase
class Guerrero extends PersonajeBase {
    int fuerza; // Atributo adicional
}

public class EjemploHerencia {
    public static void main(String[] args) {
        // Crear un objeto Guerrero
        Guerrero g = new Guerrero();
        g.nombre = "Ares";
        g.vida = 120;
        g.fuerza = 80;

        // Mostrar atributos del guerrero
        System.out.println("Guerrero: " + g.nombre + " - Vida: " + g.vida + 
        		" - Fuerza: " + g.fuerza);
    }
}
