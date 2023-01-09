package ExamenT7POO2.Ejercicio01;

public class Coche {

	//Atributo 
	private String marca;
	private String color;
	private String modelo;
	private String matricula;
	private int numPuertas;
	private int km;
	private double precio;
	
	
	//Constructores
	public Coche() {
		// TODO Auto-generated constructor stub
	}
	
	public Coche(String marca, String modelo, String matricula, int km, double precio) {
		if(km > 20000) {
			System.out.println("No se puede poner en venta, tiene mas de 20.000Km.");
			this.matricula = "Desconocido";
			this.marca = "Desconocido";
			this.modelo = "Desconocido";
			this.km = 0;
			this.precio = 0;
		}else {
			this.matricula = matricula;
			this.marca = marca;
			this.modelo = modelo;
			this.km = km;
			this.precio = precio;
		}
		
	}
	
	//Getters and Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", matricula=" + matricula
				+ ", numPuertas=" + numPuertas + ", km=" + km + ", precio=" + precio + "]";
	}
	
	
	
}

