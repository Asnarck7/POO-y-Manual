package Main;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//String = Clase
		String mensaje = "";
		String mensaje2 = "";
		
		float valor = 77.13431f;
		float valor2 = (float) 5000.50;
		int cantidadcomprado = 5;
		float totalProducto = valor2 * cantidadcomprado;
		
		mensaje = String.format("Bienvenidos %d al curso %s valor decimal %.4f", 99, "Java", valor);
		
		mensaje2 = String.format("El total de %d articulos %s es de %.3f ", cantidadcomprado , "Leche" , totalProducto );
		
		System.out.println(mensaje);
		
		System.out.println(mensaje2);
	}

}
