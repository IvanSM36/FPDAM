/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer5;

/**
 * @author IvanSM
 *
 */
public class Perecedero extends Productos {

	///// Atributos
	protected int diasACaducar;

	///// Constructores
	public Perecedero() {

		// TODO Auto-generated constructor stub
	}

	public Perecedero(String nombre, double precio, int diasCaduca) {
		super(nombre, precio);
		this.diasACaducar = diasCaduca;
	}

	///// Getters and Setters
	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	///// Metodos

	/*
	 * Aparte de lo que hace producto, el precio se reducirá según los días a caducar: 
	 * ▪ Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
	 * ▪ Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
	 * ▪ Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.
	 */
	public double calcular(int cantidadProductos) {
		double precioFinal = 0;
		System.out.println("Productos perecederos");
		System.out.println("---------------------");
		double precioTotal = super.calcular(cantidadProductos);
		// System.out.println("Precio total: " + precioFinal + "");
		if (getDiasACaducar() == 1) {
			precioFinal = precioTotal - (precioTotal / 4);
			setPrecio(precioFinal);
		}
		if (getDiasACaducar() == 2) {
			precioFinal = precioTotal - (precioTotal / 3);
			setPrecio(precioFinal);
		}
		if (getDiasACaducar() == 3) {
			precioFinal = precioTotal - (precioTotal / 2);
			setPrecio(precioFinal);
		}
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Perecedero [diasACaducar=" + diasACaducar + ", nombre=" + nombre + ", precio=" + precio
				+ ", getDiasACaducar()=" + getDiasACaducar() + "]";
	}

}
