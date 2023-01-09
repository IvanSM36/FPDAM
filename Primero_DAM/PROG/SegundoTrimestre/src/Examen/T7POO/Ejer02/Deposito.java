package Examen.T7POO.Ejer02;

public class Deposito {

// ATRIBUTOS

	private double diametro;
	private double altura;
	private String identificador;

// CONSTRUCTORES

	public Deposito(double diametro, double altura, String identificador) {

		if (diametro < 0 || altura < 0) {
			this.diametro = 100;
			this.altura = 5;
			this.identificador = "000";
		} else {
			this.diametro = diametro;
			this.altura = altura;
			this.identificador = identificador;
		}
	}

// GETTERS Y SETTERS

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

// METODOS

	/**
	 * Metodo que devuelve el volumen del deposito
	 * 
	 * @return volumen
	 */
	public double volumen() {

		double volumen = Math.PI * altura * Math.pow((diametro / 2), 2);

		return volumen;
	}
}

