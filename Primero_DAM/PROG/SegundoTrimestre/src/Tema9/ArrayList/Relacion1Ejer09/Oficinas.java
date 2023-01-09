package Tema9.ArrayList.Relacion1Ejer09;

public class Oficinas implements Edificio {
	// Atributos
	private int numeroOficinas;
	private double superficieEdificio;

	// Constructores
	public Oficinas() {
		// TODO Auto-generated constructor stub
	}

	public Oficinas(int numeroOficinas, double superficieEdificio) {
		this.numeroOficinas = numeroOficinas;
		this.superficieEdificio = superficieEdificio;
	}

	// Getters and Setters
	public int getNumeroOficinas() {
		return numeroOficinas;
	}

	public void setNumeroOficinas(int numeroOficinas) {
		this.numeroOficinas = numeroOficinas;
	}

	public void setSuperficieEdificio(double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}

	// Metodos
	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return superficieEdificio;
	}

	@Override
	public String toString() {
		return "Oficinas [numeroOficinas=" + numeroOficinas + ", superficieEdificio=" + superficieEdificio
				+ ", getNumeroOficinas()=" + getNumeroOficinas() + ", getSuperficieEdificio()="
				+ getSuperficieEdificio() + "]";
	}

	

	
}
