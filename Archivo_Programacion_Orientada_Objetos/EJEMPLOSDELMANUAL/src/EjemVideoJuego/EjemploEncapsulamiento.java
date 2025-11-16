package EjemVideoJuego;

// Clase que representa a un personaje con vida encapsulada
class PersonajeEncapsulado {
	
    private int vida = 100;

    // Método público que permite modificar la vida de manera controlada
    // Aquí se resta la cantidad de vida cuando el personaje recibe daño
    public void recibirDaño(int cantidad) {
        vida -= cantidad;
    }

    // Método público para consultar la vida actual del personaje
    public int getVida() {
        return vida;
    }
}

// Clase principal para ejecutar el ejemplo de encapsulamiento
public class EjemploEncapsulamiento {
    public static void main(String[] args) {
        PersonajeEncapsulado p = new PersonajeEncapsulado();

        p.recibirDaño(30);

        System.out.println("Vida actual del personaje: " + p.getVida());
    }
}
