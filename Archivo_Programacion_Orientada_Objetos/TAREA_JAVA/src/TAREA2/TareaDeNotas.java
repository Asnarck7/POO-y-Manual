package TAREA2;
import javax.swing.JOptionPane;

public class TareaDeNotas {

    static int[] numeros = new int[10];
    static int cantidad = 0;

    public static void main(String[] args) {
        boolean salir = false;
        while (salir == false) {
            String menu = "* MENÚ *\n"
                    + "1. Adicionar\n"
                    + "2. Consultar (cantidad)\n"
                    + "3. Listar\n"
                    + "4. Invertir\n"
                    + "5. Eliminar\n"
                    + "6. Ordenar por burbuja\n"
                    + "7. Ordenar por selección\n"
                    + "8. Ordenar por inserción\n"
                    + "9. Búsqueda binaria\n"
                    + "0. Salir\n"
                    + "Seleccione una opción:";
            String opcion1 = JOptionPane.showInputDialog(menu);
            if (opcion1 == null) {
                salir = true;
                break;
            }

            int opcion;
            try {
                opcion = Integer.parseInt(opcion1);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
                continue;
            }

            if (opcion == 1) {
                adicionar();
            } else if (opcion == 2) {
                consultar();
            } else if (opcion == 3) {
                listar();
            } else if (opcion == 4) {
                invertir();
            } else if (opcion == 5) {
                eliminar();
            } else if (opcion == 6) {
                ordenarBurbuja();
            } else if (opcion == 7) {
                ordenarSeleccion();
            } else if (opcion == 8) {
                ordenarInsercion();
            } else if (opcion == 9) {
                busquedaBinaria();
            } else if (opcion == 0) {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                salir = true;
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    // ===== 1) Adicionar =====
    static void adicionar() {
        if (cantidad >= numeros.length) {
            JOptionPane.showMessageDialog(null, "El arreglo está lleno.");
            return;
        }
        String valor1 = JOptionPane.showInputDialog("Ingrese un número:");
        if (valor1 == null) return;
        try {
            int valor = Integer.parseInt(valor1);
            numeros[cantidad] = valor;
            cantidad++;
            JOptionPane.showMessageDialog(null, "Número agregado. Usados: " + cantidad + "/10");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido.");
        }
    }

    //  2) Consultar (cantidad) 
    static void consultar() {
        int libres = numeros.length - cantidad;
        JOptionPane.showMessageDialog(
                null,
                "Elementos almacenados: " + cantidad
                        + "\nEspacios libres: " + libres
                        + "\nCapacidad total: " + numeros.length
        );
    }

    // 3) Listar 
    static void listar() {
        if (cantidad == 0) {
            JOptionPane.showMessageDialog(null, "No hay números registrados.");
            return;
        }
        String salida = "LISTA DE NÚMEROS\n";
        for (int i = 0; i < cantidad; i++) {
            salida += (i + 1) + ". " + numeros[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }

    // 4) Invertir 
    static void invertir() {
        if (cantidad <= 1) {
            JOptionPane.showMessageDialog(null, "No hay suficientes elementos para invertir.");
            return;
        }
        for (int i = 0; i < cantidad / 2; i++) {
            int temporal = numeros[i];
            numeros[i] = numeros[cantidad - 1 - i];
            numeros[cantidad - 1 - i] = temporal;
        }
        JOptionPane.showMessageDialog(null, "Arreglo invertido.");
        listar();
    }

    // 5) Eliminar
    static void eliminar() {
        if (cantidad == 0) {
            JOptionPane.showMessageDialog(null, "No hay elementos para eliminar.");
            return;
        }
        String valor1 = JOptionPane.showInputDialog("Ingrese el número a eliminar:");
        if (valor1 == null) return;

        int eliminar;
        try {
            eliminar = Integer.parseInt(valor1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido.");
            return;
        }

        int posicion = -1;
        for (int i = 0; i < cantidad; i++) {
            if (numeros[i] == eliminar) {
                posicion = i;
                break;
            }
        }
        if (posicion == -1) {
            JOptionPane.showMessageDialog(null, "Número no encontrado.");
        } else {
            for (int i = posicion; i < cantidad - 1; i++) {
                numeros[i] = numeros[i + 1];
            }
            cantidad--;
            JOptionPane.showMessageDialog(null, "Número eliminado. Usados: " + cantidad + "/10");
        }
    }

    //6) Ordenar por burbuja 
    static void ordenarBurbuja() {
        if (cantidad <= 1) {
            JOptionPane.showMessageDialog(null, "No hay suficientes datos para ordenar.");
            return;
        }
        boolean cambio;
        for (int pasada = 0; pasada < cantidad - 1; pasada++) {
            cambio = false;
            for (int i = 0; i < cantidad - 1 - pasada; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = temp;
                    cambio = true;
                }
            }
            if (!cambio) break;
        }
        JOptionPane.showMessageDialog(null, "Ordenado por burbuja (ascendente).");
        listar();
    }

    // 7) Ordenar por selección 
    static void ordenarSeleccion() {
        if (cantidad <= 1) {
            JOptionPane.showMessageDialog(null, "No hay suficientes datos para ordenar.");
            return;
        }
        for (int i = 0; i < cantidad - 1; i++) {
            int Min = i;
            for (int j = i + 1; j < cantidad; j++) {
                if (numeros[j] < numeros[Min]) {
                    Min = j;
                }
            }
            int temp = numeros[i];
            numeros[i] = numeros[Min];
            numeros[Min] = temp;
        }
        JOptionPane.showMessageDialog(null, "Ordenado por selección (ascendente).");
        listar();
    }

    //  8) Ordenar por inserción 
    static void ordenarInsercion() {
        if (cantidad <= 1) {
            JOptionPane.showMessageDialog(null, "No hay suficientes datos para ordenar.");
            return;
        }
        for (int i = 1; i < cantidad; i++) {
            int clave = numeros[i];
            int j = i - 1;
            while (j >= 0 && numeros[j] > clave) {
                numeros[j + 1] = numeros[j];
                j = j - 1;
            }
            numeros[j + 1] = clave;
        }
        JOptionPane.showMessageDialog(null, "Ordenado por inserción (ascendente).");
        listar();
    }

    // 9) Búsqueda binaria 
    static void busquedaBinaria() {
        if (cantidad == 0) {
            JOptionPane.showMessageDialog(null, "No hay datos para buscar.");
            return;
        }

        if (!Ordenar()) {
            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "El arreglo no está ordenado ascendentemente.\n" +
                    "¿Deseas ordenarlo por burbuja antes de buscar?",
                    "Búsqueda binaria",
                    JOptionPane.YES_NO_OPTION
            );
            if (respuesta == JOptionPane.YES_OPTION) {
                ordenarBurbuja();
            } else {
                JOptionPane.showMessageDialog(null, "Operación cancelada. La búsqueda binaria requiere orden ascendente.");
                return;
            }
        }

        String texto = JOptionPane.showInputDialog("Número a buscar (binaria):");
        if (texto == null) return;

        int objetivo;
        try {
            objetivo = Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido.");
            return;
        }

        int pos = buscarbinario(numeros, 0, cantidad - 1, objetivo);
        if (pos == -1) {
            JOptionPane.showMessageDialog(null, "❌ Número no encontrado.");
        } else {
            JOptionPane.showMessageDialog(null, "✅ Número encontrado en la posición (índice): " + pos);
        }
    }

  
    static boolean Ordenar() {
        for (int i = 0; i < cantidad - 1; i++) {
            if (numeros[i] > numeros[i + 1]) return false;
        }
        return true;
    }

    // Búsqueda binaria 
    static int buscarbinario(int[] arr, int ini, int fin, int objetivo) {
        int izq = ini;
        int der = fin;
        while (izq <= der) {
            int mid = (izq + der) / 2;
            if (arr[mid] == objetivo) {
                return mid;
            } else if (arr[mid] < objetivo) {
                izq = mid + 1;
            } else {
                der = mid - 1;
            }
        }
        return -1;
    }
}