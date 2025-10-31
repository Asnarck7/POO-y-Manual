package EjemVideoJuego;

public class Personaje {
    // Atributos
    String nombre;
    int vida;

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("El personaje es " + nombre + " con vida " + vida);
    }

    // Método para atacar
    public void atacar(String enemigo) {
        System.out.println(nombre + " ataca a " + enemigo + " con su espada.");
    }

    // Método para recibir daño
    public void recibirDanio(int puntos) {
        vida -= puntos;
        System.out.println(nombre + " ha recibido " + puntos + " de daño. Vida restante: " + vida);
    }
}
