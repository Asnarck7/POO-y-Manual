package EjemVideoJuego;

public class Main {
    public static void main(String[] args) {
        // Crear un personaje
        Personaje guerrero = new Personaje();
        guerrero.nombre = "Thor";
        guerrero.vida = 100;

        // Usar los métodos
        guerrero.mostrarInfo();
        guerrero.atacar("Loki");
        guerrero.recibirDanio(20);
        guerrero.mostrarInfo();
    }
}
