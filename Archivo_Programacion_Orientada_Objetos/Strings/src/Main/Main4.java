package Main;

public class Main4 {
	public static void main(String[] args) 
	{
		

	// Concatenar Primera Version String
	String nombre = "Codi";
	String curso = "Curso de Java 9";
	String mensaje = "Hola, bienvenido ".concat(nombre);
	mensaje = mensaje.concat(" al ");
	mensaje = mensaje.concat(curso);
	mensaje = mensaje.concat(".");
	System.out.println(mensaje);
		
		
	//concatenar Segunda version String
	String nombre2 = "Julanito";
	String Salon = "Salon De Sistemas 4";
	
	String mensaje2 = "Hola, bienbenidos " + nombre2 + " al " + Salon + ".";
	System.out.println(mensaje2);
	//
	System.out.println();
	//
	
	
	
	}
}
