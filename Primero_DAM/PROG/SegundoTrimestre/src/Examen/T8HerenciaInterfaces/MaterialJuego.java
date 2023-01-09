package Examen.T8HerenciaInterfaces;

public class MaterialJuego {

// ATRIBUTOS
	
	private String nombreMaterial;
	private int numElementos;
	private double costeUnitario;
	
// CONSTRUCTOR
	
	public MaterialJuego(String nombreMaterial, int numElementos, double costeUnitario) {
		this.nombreMaterial = nombreMaterial;
		this.numElementos = numElementos;
		this.costeUnitario = costeUnitario;
	}
	
// GETTER Y SETTERS
	
	public String getNombreMaterial() {
		return nombreMaterial;
	}

	public void setNombreMaterial(String nombreMaterial) {
		this.nombreMaterial = nombreMaterial;
	}

	public int getNumElementos() {
		return numElementos;
	}

	public void setNumElementos(int numElementos) {
		this.numElementos = numElementos;
	}

	public double getCosteUnitario() {
		return costeUnitario;
	}

	public void setCosteUnitario(double costeUnitario) {
		this.costeUnitario = costeUnitario;
	}
	
// METODOS
	
	/**
	 * Metodo toString
	 */
	public String toString() {
		return "MaterialJuego [nombreMaterial=" + nombreMaterial + ", numElementos=" + numElementos + ", costeUnitario="
				+ costeUnitario + "]";
	}
}
