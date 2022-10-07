package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	//contructor 
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
		
	}
	
	//getter

	public String getFecha() {
		return fecha;
	}
	
	public String getPrimicia() {
		return primicia;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	//setter

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos
	
	public String toString() {
		return (getOrigen()+ "\n" +getTitulo()+ "\n" +getAutor()+ "\n" +getPaginas()+ "\n" +fecha+ "\n" + primicia);
	}
	
	public int palabrasTotales(int parametro) {
		int factor= 10;
		return getPaginas()*parametro*factor;
	}
	
	public String interpretacion() {
		return (this.interpretacion);
	}
	
}
