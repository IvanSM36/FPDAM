package Tema9.ArrayList.Relacion1Ejer10;


public class Instrumento {
	//atributo
	protected String id;
	protected double precio;
	protected Tipo tipo;
	
	//CONTRUCTOR
	Instrumento(String id, double precio, Tipo tipo){
		this.id=id;
		this.precio=precio;
		this.tipo=tipo;
	}
	
	//Getter and Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	//metodo

	@Override
	public String toString() {
		return "Instrumento [id=" + id + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
	
	

}
