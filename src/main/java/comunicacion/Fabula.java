package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	
	//contructor
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
		
	}
	//getter

	public String getEnsenanza() {
		return ensenanza;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	//setter

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}


	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos
	
	public String toString() {
		return (getOrigen()+ "\n" +getTitulo()+ "\n" +getAutor()+ "\n" +getPaginas()+ "\n" +ensenanza);
	}
	
	public int palabrasTotales(int parametro) {
		int factor= 1;
		return getPaginas()*parametro*factor;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	

}
