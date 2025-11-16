	package Main;
	
	public class Main {
		
		public static void main(String[] args)
		{
			//String
			String mensaje = "Hola, soy un String ñaña";
			String mensaje2 = new String("texto2222");
	
			System.out.println("texto1 "+mensaje);
			System.out.println("texto2 "+mensaje2);
			
			//Métodos para cadenas
			String mensaje3 = "Hola, soy un String2";
			
			int cantidad = mensaje3.length();
			
			//puede ser un texto o puede ser un solo caracter (g)
			boolean comienzaContiene = mensaje3.contains("hola");
			boolean terminaCon = mensaje3.endsWith("String2");
			
			System.out.println("la cantidad de caracteres del texto es: " +cantidad);
			System.out.println("Lo contiene cuando comienza si o no: " +comienzaContiene);
			System.out.println("Lo contiene cuando termina si o no: " +terminaCon);
			
			String nuevoString = mensaje3.concat(" estamos en el curso de Java ");
			System.out.println("Reemplazamos texto del mensaje3: "+ nuevoString);
		}
		
		
		
	}
