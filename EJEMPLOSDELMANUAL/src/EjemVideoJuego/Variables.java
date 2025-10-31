package EjemVideoJuego;

public class Variables {

    public static void main(String[] args) {
        
        // ----------------------------
        // Tipos de variables basicos
        // ----------------------------
        
        // String: cadena de texto
        String nombrePersonaje = "Thor";
        System.out.println("Nombre del personaje: " + nombrePersonaje);

        // int: numero entero
        int vida = 100;
        System.out.println("Vida: " + vida);

        // float: numero decimal
        float velocidad = 5.5f;
        System.out.println("Velocidad: " + velocidad);

        // boolean: valor logico
        boolean estaVivo = true;
        System.out.println("Esta vivo?: " + (estaVivo ? "Si" : "No"));

        System.out.println(); // Salto de linea para separar ejemplos
        
        // ----------------------------
        // Operaciones con variables
        // ----------------------------
        
        // Incrementar vida
        vida += 20; // Suma 20 a la vida actual
        System.out.println("Vida despues de recibir vida extra: " + vida);

        // Modificar velocidad
        velocidad = velocidad + 2.0f; // Aumenta la velocidad
        System.out.println("Velocidad aumentada: " + velocidad);

        // Cambiar estado
        estaVivo = false; // El personaje muere
        System.out.println("Estado actualizado: Esta vivo? " + (estaVivo ? "Si" : "No"));

        System.out.println(); // Salto de linea
        
        // ----------------------------
        // Ejemplo practico tipo videojuego
        // ----------------------------
        
        // Crear variables para un enemigo
        String nombreEnemigo = "Goblin";
        int vidaEnemigo = 50;
        float velocidadEnemigo = 3.2f;
        boolean enemigoVivo = true;

        // Mostrar informacion en consola
        System.out.println("Enemigo: " + nombreEnemigo);
        System.out.println("Vida del enemigo: " + vidaEnemigo);
        System.out.println("Velocidad del enemigo: " + velocidadEnemigo);
        System.out.println("Enemigo vivo?: " + (enemigoVivo ? "Si" : "No"));

        System.out.println(); // Salto de linea

        // Simulacion de dano al enemigo
        int danio = 20;
        vidaEnemigo -= danio; // Restar dano
        System.out.println("Vida del enemigo despues del ataque: " + vidaEnemigo);

        // Verificar si el enemigo sigue vivo
        if (vidaEnemigo <= 0) {
            enemigoVivo = false;
        }
        System.out.println("Enemigo vivo despues del ataque?: " + (enemigoVivo ? "Si" : "No"));

    }

}
