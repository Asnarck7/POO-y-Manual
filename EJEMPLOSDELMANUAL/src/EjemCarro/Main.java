package EjemCarro;

public class Main {

    // Clase Carro: representa el molde o plantilla
    static class Carro {
        String marca;
        String modelo;

        // Métodos: acciones del carro
        void arrancar() {
            System.out.println(marca + " " + modelo + " esta arrancando...");
        }

        void frenar() {
            System.out.println(marca + " " + modelo + " esta frenando...");
        }
    }

    public static void main(String[] args) {
        // Crear un objeto (instancia de Carro)
        Carro miCarro = new Carro();

        // Asignar valores a los atributos
        miCarro.marca = "Toyota";
        miCarro.modelo = "Corolla";

        // Usar los métodos
        miCarro.arrancar();
        miCarro.frenar();
    }
}
