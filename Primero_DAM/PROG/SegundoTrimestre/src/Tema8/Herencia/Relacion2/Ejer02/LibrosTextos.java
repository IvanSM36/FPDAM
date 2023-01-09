package Tema8.Herencia.Relacion2.Ejer02;

public class LibrosTextos extends Libro{
	//Atributos
	protected int curso;
	
	//Contructores
	public LibrosTextos() {

	}
		
	public LibrosTextos(String titulo, String autor, int curso) {
		super(titulo, autor);
		this.curso = curso;
		
	}

	//Getters and Setters
	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}  

	//Metodos

	@Override
	public String toString() {
		return super.toString() + "\nLibrosTextos [curso=" + curso + "]";
	}

	
	
}
