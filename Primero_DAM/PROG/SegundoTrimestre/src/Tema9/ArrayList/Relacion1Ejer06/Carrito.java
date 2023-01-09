package Tema9.ArrayList.Relacion1Ejer06;

import java.util.ArrayList;

public class Carrito {

	ArrayList<Elemento> cesta = new ArrayList<>();

	public Carrito() {
		// TODO Auto-generated constructor stub
	}

	// Metodos
	public int numeroDeElementos() {
		return cesta.size();
	}

	public void agrega(Elemento item) {
		cesta.add(item);
	}

	public double importeTotal() {
		double total = 0;
		for (Elemento e : cesta) {
			total += e.getPrecio() * e.getCantidad();
		}
		return total;
	}

	@Override
	public String toString() {
		String pinta = "Contenido del carrito\n=====================\n";
		for (Elemento e : cesta) {
			pinta += e + "\n";
		}
		return pinta;
	}

}
