package Tema9.Interfaces.Relacion1.Ejer07;

public class Masajista extends SeleccionFutbol {

	//Atributos
	protected String titulacion;
	protected int aniosExperiencia;
	
	//Constructores
	public Masajista() {
		// TODO Auto-generated constructor stub
	}

	public Masajista(int id, String nombre, String apellidos, int edad, String titulo, int aniosExpe) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulo;
		this.aniosExperiencia = aniosExpe;
	}

	//Guetters and Setters
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	//Metodos
	public void darMasaje() {
		
	}
	
	

}
