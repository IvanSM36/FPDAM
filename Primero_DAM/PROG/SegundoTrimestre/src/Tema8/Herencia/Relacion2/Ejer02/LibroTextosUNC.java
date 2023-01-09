package Tema8.Herencia.Relacion2.Ejer02;

public class LibroTextosUNC extends LibrosTextos{
	protected String facultad;
	
	public LibroTextosUNC() {

	}

	public LibroTextosUNC(String titulo, String autor, int curso, String facultad) {
		super(titulo, autor, curso);
		this.facultad = facultad;
		
	}

	//Getters and Setters
	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	//Metodos
	@Override
	public String toString() {
		return super.toString() + "\nLibroTextosUNC [facultad=" + facultad + "]";
	}
	
	
}
