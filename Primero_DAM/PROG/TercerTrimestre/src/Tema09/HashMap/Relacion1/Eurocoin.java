package Tema09.HashMap.Relacion1;

import java.util.ArrayList;

public class Eurocoin {
	public static void main(String[] args) {
		ArrayList<Moneda> m = new ArrayList<Moneda>();

		Moneda monedaAux = new Moneda();
		m.add(monedaAux);

		String ultimaPosicion = monedaAux.getPosicion();
		String ultimaCantidad = monedaAux.getCantidad();
		System.out.println("**************" + ultimaPosicion);
		System.out.println("***************" + ultimaCantidad);
		for (int i = 0; i < 5; i++) {
			do {
				monedaAux = new Moneda();
			} while (!((monedaAux.getPosicion()).equals(ultimaPosicion))
					&& !((monedaAux.getCantidad()).equals(ultimaCantidad)));

			m.add(monedaAux);
			// ultimaPosicion = monedaAux.getPosicion();
			// ultimaCantidad = monedaAux.getCantidad();
			System.out.println("**************2****" + ultimaPosicion);
			System.out.println("***************2*****" + ultimaCantidad);
		}

		for (Moneda mo : m) {
			System.out.println(mo);
		}
	}
}
