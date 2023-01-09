package Tema9.Interfaces.Relacion1.Ejer07;

public class Futbolista extends SeleccionFutbol {
	// Atributos
	protected int dorsal;
	protected String demarcacion;

	// Constructores
	public Futbolista() {
		// TODO Auto-generated constructor stub
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	// Guetters and Setters
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	// Metodos
	public void entrevista() {

	}
}
