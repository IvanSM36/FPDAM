package Tema10Exceptions.Relacion1;

public class Ejercicio02Gato {
	
	private String nombre;
	private String sexo;
	
	// Constructores	
	public Ejercicio02Gato() {
		
	}
	
	public Ejercicio02Gato(String nombre, String sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}

	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	// Metodos
	public void aparearCon(Ejercicio02Gato g) throws Ejercicio02ExceptionPropio {
		if(this.sexo.equals(g.sexo)) {
			throw new Ejercicio02ExceptionPropio();
		}else {
			System.out.println(this.nombre + " se aparea con " + g.nombre);
		}
	}	
}
