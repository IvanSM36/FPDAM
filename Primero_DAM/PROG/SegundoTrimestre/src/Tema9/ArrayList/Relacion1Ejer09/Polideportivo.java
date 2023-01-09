package Tema9.ArrayList.Relacion1Ejer09;

public class Polideportivo implements InstalacionDep, Edificio {
	// Atributos
	private int tipoDeInstalacion;
	private double superficieEdificio;
	private String nombre;

	// Constructores
	public Polideportivo() {
		// TODO Auto-generated constructor stub
	}

	public Polideportivo(int tipoDeInstalacion, double superficieEdificio, String nombre) {
		this.tipoDeInstalacion = tipoDeInstalacion;
		this.superficieEdificio = superficieEdificio;
		this.nombre = nombre;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
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
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return tipoDeInstalacion;
	}

	@Override
	public String toString() {
		return "Polideportivo [tipoDeInstalacion=" + tipoDeInstalacion + ", superficieEdificio=" + superficieEdificio
				+ ", nombre=" + nombre + ", getNombre()=" + getNombre() + ", getSuperficieEdificio()="
				+ getSuperficieEdificio() + ", getTipoDeInstalacion()=" + getTipoDeInstalacion() + "]";
	}

	
	
	

}
