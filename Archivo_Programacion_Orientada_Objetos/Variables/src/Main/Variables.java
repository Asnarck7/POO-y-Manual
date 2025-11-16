package Main;

public class Variables {

	public static void main(String[] args) {
		 // Ejemplo de operadores aritméticos

        int variableX = 50, variableY = 10;
        float resultado;

        // Suma
        resultado = variableX + variableY;
        System.out.println("Suma: " + resultado);

        // Resta
        resultado = variableX - variableY;
        System.out.println("Resta: " + resultado);

        // Resta inversa
        resultado = variableY - variableX;
        System.out.println("Resta inversa: " + resultado);

        // Multiplicación
        resultado = variableX * variableY;
        System.out.println("Multiplicación: " + resultado);

        // División
        resultado = (float) variableX / variableY; // casteo para evitar división entera
        System.out.println("División: " + resultado);

        // División inversa
        resultado = (float) variableY / variableX; // también casteo
        System.out.println("División inversa: " + resultado);
		
		// otro ejercicio
		
		int a = 5; 
		int b = a++;
		
		System.out.println("a = " + a + " b = " + b);
		b = a++;
		System.out.println("a = " + a + " b = " + b);
		a++;
		++b;
		System.out.println("a = " + a + " b = " + b);
		a = a + 10;
		System.out.println("a = " + a + " b = " + b);
		b = b + 10;
		System.out.println("a = " + a + " b = " + b);


	}
}
