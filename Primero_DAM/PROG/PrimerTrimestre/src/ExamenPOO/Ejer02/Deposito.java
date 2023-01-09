package ExamenPOO.Ejer02;

public class Deposito {

	//Atributos
	private double diametro;
	private double altura;
	private String identificador;
	
	// Constructores
	/*Cuando se genera un depósito, se debe validar cada una de las características
	*anteriores, teniendo en cuenta que, para recoger los valores iniciales, deben
	*ser positivos. En caso contrario, el diámetro sería 100, altura 5 y el
	*identificador “000”
	*/
	public Deposito(double diametro, double altura, String identificador) {
		if(diametro < 0 || altura < 0) {
			this.diametro = 0;
			this.altura = 0;
			this.identificador = "000";
		}else {
			this.diametro = diametro;
			this.altura = altura;
			this.identificador = identificador;
		}
	}
	
	//Getters and Setters
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
	
	//Metodos
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
