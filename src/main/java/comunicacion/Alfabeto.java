package comunicacion;

public class Alfabeto extends Pictograma {
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
		}

	// getter
	public static String[] getLetras() {
		return letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	
	//setter

	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos 
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
		
	}
		
	public int cantidadLetras() {
			return letras.length;
	}
			
		
	
	
	
	
}
