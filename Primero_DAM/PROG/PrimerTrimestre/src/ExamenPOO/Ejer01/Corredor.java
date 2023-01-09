package ExamenPOO.Ejer01;

public class Corredor {

	//Atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private char sexo;
	private int marcaConseguida;
	
	//Por defecto
	public Corredor() {

	}

	//Constructores
	public Corredor(String nombre, String apellido1, String apellido2, int edad, char sexo) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.sexo = sexo;
	}

	//Guetters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getMarcaConseguida() {
		return marcaConseguida;
	}

	public void setMarcaConseguida(int marcaConseguida) {
		this.marcaConseguida = marcaConseguida;
	}
	
	
	
	
}
