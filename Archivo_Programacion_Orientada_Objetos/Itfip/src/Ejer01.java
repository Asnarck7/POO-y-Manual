
public class Ejer01 {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		X a, b;
		a = new X();
		a.imprime();
		
		b = new X(10);
		b.imprime();
	}

}

class X {
	int i;
	
	//constructot
	X(){
		i = 5;
	}
	
	X(int i){
		this.i = i;
	}
	
	void imprime() {
		System.out.println(" valor i = " + i);
	}
	
}