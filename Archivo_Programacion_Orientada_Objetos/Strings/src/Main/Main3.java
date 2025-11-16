package Main;

public class Main3 {

	public static void main(String[] args) 
	{
		//String = clase // explicar porque
		//creamos dos ejemplos de comparar con string
		String cadena1 = "Hola Mi Bro";
		String cadena2 = "Hola Mi Bro";
		
		String cadena3 = "Hola Mi Bro";
		String cadena4 = "Hola mi bro";
		//codigo para comparar
		boolean resultado = cadena1.equals(cadena2);		
		boolean resultado2 = cadena3.equals(cadena4);
		
		String cad5 = "a";
		String cad6 = "b";
		
		boolean res = cad5 == cad6;
		System.out.println(res); 	
		
		//impremir el resultado si es true o false ya que utilizamos un boolean
		System.out.println(resultado);
		System.out.println(resultado2);
		
		String cadena5 = "HOLA";
        String cadena6 = "hola";

        // Convertimos ambas cadenas a mayúsculas y comparamos
        boolean resultado3 = cadena6.toUpperCase().equals(cadena5.toUpperCase());
        System.out.println(resultado3); // true

        // Comparar ignorando mayúsculas/minúsculas con equalsIgnoreCase
        boolean resultado4 = cadena5.equalsIgnoreCase(cadena6);
        System.out.println(resultado4); // true
		
		
	
		
	}

}
