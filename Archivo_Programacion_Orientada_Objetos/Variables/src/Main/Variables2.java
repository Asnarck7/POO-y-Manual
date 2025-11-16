package Main;

public class Variables2 {
	//Cast
	
	public static void main(String[] args) 
	
	{
	int		variableX = 50;
	float	variableZ = 5.5f;
	int	resultado;
	
	// donde escribimos += o (int) en el variable o fuera de ella
	resultado = (variableX += variableZ);
	
	System.out.println("Resultado: " + resultado);
	
	// Operaciones
	int vx = 50;        // variable entera
	float vz = 5.5f;    // variable decimal

	// Uso de += con float (Java hace el casting implícito a int)
	vx += vz;           // vx = (int)(vx + vz) → 50 + 5.5 = 55
	                    // ahora vx vale 55

	// Uso de float en las operaciones
	float r2;
	r2 = vx + vz;       // 55 + 5.5 = 60.5 (se guarda en float)

	// División entre flotantes para obtener decimales
	r2 = 10f / 3f;      // 10 / 3 = 3.333...
	System.out.println("r2 = " + r2);

	// Otra forma con casting explícito
	r2 = (float) 10 / (float) 3;  // igual: 3.333...
	System.out.println("r2 = " + r2);

	}

}
