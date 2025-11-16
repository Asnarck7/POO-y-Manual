package Futbolista;

public class Futbolista {
	// Atributos
	String nombre;
	String posicion; // ej arquero, defensa, mediocampista, delantero
	String equipo;
	int numeroCamiseta;
	int velocidad;
	int nivelPasar;
	int NivelDisparo;
	String celebracion;

	// Constructor
	public Futbolista (String nombre, String posicion, String equipo, int numeroCamiseta, int velocidad,
    		int nivelPasar, int NivelDisparo, String celebracion)
    {
    	this.nombre 		= nombre;
    	this.posicion 		= posicion;
    	this.equipo 		= equipo;
    	this.numeroCamiseta = numeroCamiseta ;
    	this.velocidad		= velocidad;
    	this.nivelPasar 	= nivelPasar;
    	this.NivelDisparo	= NivelDisparo;
    	this.celebracion	= celebracion;
    }

	// Metodos
	public void correr() {
		System.out.println(nombre + " ( " + posicion + " ) corre con velocidad : " + velocidad);

	}

	public void pasarBalon() {
		System.out.println(nombre + " ( " + posicion + " ) Pasar el balon con presicion de : " + nivelPasar);
	}

	public void disparar() {
		System.out.println(nombre + " ( " + posicion + " ) Disparo con potencia de :" + NivelDisparo);
	}

	public void celebrar() {
		System.out.println(nombre + " ( " + posicion + " ) Forma de celebrar el GOL : " + celebracion);
	}

	public void mostrarInfo() {
		System.out.println("Jugador: " + nombre + " | Posicion : " + posicion + " | Equipo: " + equipo
				+ " | Camiseta : " + numeroCamiseta);
	}
}
