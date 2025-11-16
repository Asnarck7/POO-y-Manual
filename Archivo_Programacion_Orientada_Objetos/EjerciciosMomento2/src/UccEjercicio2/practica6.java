package UccEjercicio2;

public class practica6 {
	
	//ejercicio anidadas

	public static void main (String[] args)
	{
		int promedio = 4;
		
		if (promedio >= 7)
		{
			//el promedio es aprobado
			if (promedio == 10)
			{
				System.out.println("Muchas felicidades");
			}
			else
			{
				System.out.println("Felicidades");
			}
		}
		else
		{
			//el promedio no es aprobado
			System.out.println("Felicidades NO aprobaste");
		}
	}
}
