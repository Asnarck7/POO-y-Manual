package Futbolista;

public class Main {
	public static void main(String[] args) {
		// Crear un jugador
		Futbolista jugador1 = new Futbolista("Cristiano", "Delantero", "Equipo A", 7, 95, 85, 98, "Gritando Siuuuu");
		

		// podemos crear mas jugadores
		
		Futbolista jugador2 = new Futbolista("Lionel Messi", "Delantero", "Equipo A", 10, 93, 90, 96,"Corriendo con brazos abiertos");
		Futbolista jugador3 = new Futbolista("Neymar", "Delantero", "Equipo A", 11, 92, 88, 94, "Saltando y celebrando");
		Futbolista jugador4 = new Futbolista("Luka Modric", "Mediocampista", "Equipo A", 8, 85, 95, 85,"Aplaudiendo al público");
		Futbolista jugador5 = new Futbolista("Toni Kroos", "Mediocampista", "Equipo A", 8, 84, 94, 82,"Levantando los brazos");
		Futbolista jugador6 = new Futbolista("Sergio Ramos", "Defensa", "Equipo A", 4, 80, 78, 75, "Señalando al escudo");
		Futbolista jugador7 = new Futbolista("Gerard Piqué", "Defensa", "Equipo A", 3, 79, 77, 70, "Gritando con fuerza");
		Futbolista jugador8 = new Futbolista("Marcelo", "Defensa", "Equipo A", 12, 81, 80, 72, "Saltando y aplaudiendo");
		Futbolista jugador9 = new Futbolista("Thibaut Courtois", "Arquero", "Equipo A", 1, 60, 70, 65, "Saltando de alegría");
		Futbolista jugador10 = new Futbolista("Emiliano Martínez", "Arquero", "Equipo A", 23, 62, 68, 66,"Tirándose al piso feliz");
		
		// info del jugador
		jugador1.mostrarInfo();
		// simular acciones
		jugador1.correr();
		jugador1.pasarBalon();
		jugador1.disparar();
		jugador1.celebrar();
		System.out.println();

		System.out.println();
		jugador2.mostrarInfo();
		jugador3.mostrarInfo();
		jugador4.mostrarInfo();
		jugador5.mostrarInfo();
		jugador6.mostrarInfo();
		jugador7.mostrarInfo();
		jugador8.mostrarInfo();
		jugador9.mostrarInfo();
		jugador10.mostrarInfo();
	     String version = System.getProperty("java.version");
	        System.out.println("La versión de Java es: " + version);
	}
}