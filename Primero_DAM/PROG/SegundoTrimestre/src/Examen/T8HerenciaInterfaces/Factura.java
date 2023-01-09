package Examen.T8HerenciaInterfaces;

import java.util.Arrays;

public class Factura {

// ATRIBUTOS
	
	private int id;
	private Producto[] productos; // Array de productos
	
// CONSTRUCTOR
	
	public Factura(int id) {
		this.id = id;
		this.productos = new Producto[10];
	}
	
// GETTERS Y SETTERS
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	
// METODOS
	
	
	/**
	 * METODO AUXILIAR:
	 * Calcula el número total de productos que contiene el array.
	 * @return int numProductos
	 */
	private int contarProductos() {
		
		int numProductos = 0;
		
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				numProductos++;
			}
		}
		
		return numProductos;
	}
	
	/**
	 * Este método nos permite agregar un objeto Producto al array de productos.
	 * @param producto
	 */
	public void addProducto(Producto producto) {
		
		int pos = 0;
		boolean fin = false;
		int numProductos = contarProductos();
		
		if (numProductos == productos.length) {
			System.out.println("¡¡YA NO SE PUEDEN AÑADIR MÁS PRODUCTOS!!");
			fin = true;
		}
		
		while (fin == false && pos < productos.length) {
			if (productos[pos] == null) {
				System.out.println("Producto añadido");
				productos[pos] = producto;
				fin = true;
			} else {
				pos++;
			}
		}
	}
	
	/**
	 * Este método devolverá la suma total del coste de los comics comprados.
	 * Tendrá en cuenta que para hacer este cálculo debemos ver que el objeto es un Comic.
	 * @return double costeComics
	 */
	public double calcularCosteComics() {
		
		double costeComics = 0;
		
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				if (productos[i] instanceof Comic) {
					costeComics += productos[i].calcularPrecio();
				}
			}
		}
		
		return costeComics;
	}
	
	/**
	 * Este método devolverá la suma total del coste de los juegos de mesa comprados.
	 * Tendrá en cuenta que para hacer este cálculo debemos ver que el objeto es un JuegoMesa.
	 * @return double costeJuegos
	 */
	public double calcularCosteJuegos() {
		
		double costeJuegos = 0;
		
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				if (productos[i] instanceof JuegoMesa) {
					costeJuegos += productos[i].calcularPrecio();
				}
			}
		}
		
		return costeJuegos;
	}
	
	/**
	 * Metodo que permite imprimir la factura con el formato dado
	 */
	public void imprimirFactura() {
		
		double total = calcularCosteJuegos() + calcularCosteComics();
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				System.out.println(productos[i].toString());
			}
		}
		
		System.out.printf("\nEl coste total de la factura es: %.2f", total);
	}
	
	/**
	 * Metodo toString
	 */
	public String toString() {
		return "Factura [id=" + id + ", productos=" + Arrays.toString(productos) + "]";
	}
	
	
}

