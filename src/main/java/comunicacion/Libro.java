package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;

	//constructor 
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial,
		String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
		}

	//getter 
	public String getCo_autor() {
		return co_autor;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	//setter

	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}


	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos 
	
	public String toString() {
		return  (getOrigen()+ "\n" +getTitulo()+ "\n"+getAutor()+ "\n" +getPaginas()+ "\n" +co_autor+ "\n" +editorial+ "\n" +edicion);
	}
	
	public int palabrasTotales(int parametro) {
		int factor=2;
		return getPaginas()*parametro*factor;
	}
	
	public String interpretacion() {
		return (this.interpretacion);
	}


	
}
