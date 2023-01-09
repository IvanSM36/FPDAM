package Examen.T8HerenciaInterfaces;

public class Comic extends Producto {

// ATRIBUTOS
	
	private String tematica;
	private String autor;
	private int numPaginas;
	
// CONSTRUCTORES
	
	/**
	 * Constructor por defecto
	 */
	public Comic() {

	}

	/**
	 * Constructor por parametros
	 * @param nombre
	 * @param anno
	 * @param precioBase
	 * @param califEdades
	 * @param tematica
	 * @param autor
	 * @param numPaginas
	 */
	public Comic(String nombre, int anno, double precioBase, int califEdades, String tematica, String autor, int numPaginas) {
		super(nombre, anno, precioBase, califEdades);
		this.tematica = tematica;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
// GETTERS Y SETTERS
	
	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

// METODOS
	
	/**
	 * Este metodo calcula y devuelve el precio que tendrá un comic.
	 * Teniendo en cuenta que el comic aumentará su precio base en un 5% si tiene más de 100 paginas
	 * y en un 10% si tiene más de 200 páginas.
	 * Además, si el producto es novedad (de 2020 o superior) valdrá 3 euros más.
	 * @return double precio
	 */
	public double calcularPrecio() {
		
		double precio = this.precioBase;
		
		if (this.numPaginas > 100 && this.numPaginas <= 200) { // Se evalúa si el número de páginas es mayor de 100 y menor o igual a 200
			double porcentajeCinco = (precio * 5) / 100;
			precio = precio + porcentajeCinco;
		}
		
		if (this.numPaginas > 200) { // Se evalúa si el número de páginas es mayor de 200
			double porcentajeDiez = (precio * 10) / 100;
			precio = precio + porcentajeDiez;
		}
		
		if (this.anno >= 2020) { // Se evalúa si el año de salida es de 2020 o superior
			precio = precio + 3;
		}
		
		return precio;
	}

	/**
	 * Metodo toString 
	 */
	public String toString() {
		return "Producto: " + getNombre() + ", Precio: " + calcularPrecio();
	}

}
