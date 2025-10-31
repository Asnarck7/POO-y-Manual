package NotasU;

import java.util.Scanner;
import java.util.ArrayList;

class Estudiante {
    String nombreEstudiante;
    double nota;

    public Estudiante(String nombre, double nota) {
        this.nombreEstudiante = nombre;
        this.nota = nota;
    }
}

public class NotasEstudiantes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        String continuar;

        System.out.println("❤Notas de Calificaciones❤️");
        
        do {
        	System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese la nota de " + nombre + ": ");
            double nota = teclado.nextDouble();
            teclado.nextLine();
            
            //guardar estudiante
            Estudiante est = new Estudiante(nombre, nota);
            estudiantes.add(est);
            
            //evaluar la nota
            if(nota < 0) {
            	System.out.println("Error: nota no puede ser negativa");
            }else if (nota < 3) {
            	System.out.println("Perdio no Paso");
            }else if (nota == 3) {
            	System.out.println("Paso Raspando");
            }else if(nota == 5) {
            	System.out.println("Mejor Nota");
            }else if(nota > 5) {
            	System.out.println("Ya paso, pero la nota no es valida (mayor que 5)");
            }else {
            	System.out.println("Paso la materia");
            }
            
            System.out.println("¿Desea ingresar otro estudiante? s/n");
            continuar = teclado.nextLine();
        	
        }while (continuar.equals("s"));
        
        // Mostrar listado final
        System.out.println("\n--- Listado de estudiantes ---");
        for (Estudiante e : estudiantes) {
            System.out.println("Nombre: " + e.nombreEstudiante + ", Nota: " + e.nota);
        }

        teclado.close();
    }
  }