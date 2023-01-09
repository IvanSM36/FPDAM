package Tema9.Interfaces.Relacion1.Ejer07;

public class Entrenador extends SeleccionFutbol {
	//Atributos
	protected int idFederacion;
	
	//Constructores
	public Entrenador() {
		// TODO Auto-generated constructor stub
	}
		
	public Entrenador(int id, String nombre, String apellidos, int edad, int idFede) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFede;
	}

	//Guetters and Setters
	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	//Metodos
	public void planificarEntrenamiento() {
		
	}
}
