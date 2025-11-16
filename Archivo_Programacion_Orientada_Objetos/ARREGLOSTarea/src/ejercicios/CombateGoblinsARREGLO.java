package ejercicios;

public class CombateGoblinsARREGLO {

    public static void main(String[] args) {
        // Arreglo que representa la vida de cada goblin
        int[] goblins = {50, 60, 40, 30}; // goblins[0] = 50 de vida, goblins[1] = 60, etc.
        // Daño que inflige cada personaje
        int dañoCaballero = 20;
        int dañoMago = 25;
        int dañoArquero = 15;
        System.out.println("¡Combate contra los goblins!");
        System.out.println("Goblins iniciales: ");
        mostrarGoblins(goblins); // Mostrar la vida inicial de los goblins
        // Caballero ataca a todos los goblins
        System.out.println("\nEl Caballero ataca...");
        atacarGoblins(goblins, dañoCaballero);
        mostrarGoblins(goblins); // Mostrar vida después del ataque
        // Mago ataca a todos los goblins
        System.out.println("\nEl Mago ataca...");
        atacarGoblins(goblins, dañoMago);
        mostrarGoblins(goblins);
        // Arquero ataca a todos los goblins
        System.out.println("\nEl Arquero ataca...");
        atacarGoblins(goblins, dañoArquero);
        mostrarGoblins(goblins);

        // Contar cuántos goblins siguen vivos
        int goblinsVivos = contarGoblinsVivos(goblins);
        System.out.println("\nGoblins sobrevivientes: " + goblinsVivos);
        if (goblinsVivos == 0) {
            System.out.println("¡Todos los goblins han sido derrotados!");
        } else {
            System.out.println("¡Algunos goblins siguen en pie!");
        }
    }

    // Función para mostrar la vida de cada goblin
    public static void mostrarGoblins(int[] goblins) {
        for (int i = 0; i < goblins.length; i++) {
            System.out.println("Goblin " + (i + 1) + ": " + goblins[i] + " de vida");
        }
    }

    // Función que aplica daño a todos los goblins vivos
    public static void atacarGoblins(int[] goblins, int daño) {
        for (int i = 0; i < goblins.length; i++) {
            if (goblins[i] > 0) { // solo atacar goblins que tengan vida
                goblins[i] -= daño; // restar el daño
                if (goblins[i] < 0) { // evitar valores negativos
                    goblins[i] = 0;
                }
            }
        }
    }

    // Función que cuenta cuántos goblins tienen vida mayor a 0
    public static int contarGoblinsVivos(int[] goblins) {
        int vivos = 0;
        for (int vida : goblins) {
            if (vida > 0) {
                vivos++;
            }
        }
        return vivos;
    }
}
