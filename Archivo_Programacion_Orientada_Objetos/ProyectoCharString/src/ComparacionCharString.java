
public class ComparacionCharString {
	public static void main(String[] args) 
	{
	
		//ejemplo con char
		char letra = 'A';
		System.out.println("Valor en char: " + letra);
		
		//ejemplo con String
		String palabras = "Hola Kevin Guerrero";
		System.out.println("Valor en String: " + palabras);
		
		//metodos de String
		System.out.println("Longitud de palabras: " + palabras.length());
		
		System.out.println("En mayusculas: " + palabras.toUpperCase());
		
		char numerochar = '7';
		String numeroString = "723";
		
		System.out.println("char como numero  :" + numerochar);
		System.out.println("String como numero : " + numeroString);
		System.out.println(System.getProperty("java.version"));
		System.out.println("hola mundo");
	}
}
