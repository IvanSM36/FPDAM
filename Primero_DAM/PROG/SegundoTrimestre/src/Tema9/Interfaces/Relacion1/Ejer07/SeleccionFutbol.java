package Tema9.Interfaces.Relacion1.Ejer07;

public abstract class SeleccionFutbol {
	//Atributos
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	//Constructores
	public SeleccionFutbol() {
		// TODO Auto-generated constructor stub
	}
	
	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Metodos
	
}
