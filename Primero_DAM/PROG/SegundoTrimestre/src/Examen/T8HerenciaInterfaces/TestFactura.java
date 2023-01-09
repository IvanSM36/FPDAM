package Examen.T8HerenciaInterfaces;

public class TestFactura {

	public static void main(String[] args) {
		
		// Creamos el objeto Factura
		
		Factura factura = new Factura(1);
		
		// Creamos dos objetos de tipo MaterialJuego para después poder crear dos juegos
		
		MaterialJuego material1 = new MaterialJuego("cartas", 60, 0.03);
		MaterialJuego material2 = new MaterialJuego("dados", 4, 0.1);
		
		// Creamos dos objetos de tipo JuegoMesa
		
		
		JuegoMesa juego1 = new JuegoMesa("Juego 1", 2020, 10, 5, material1);
		JuegoMesa juego2 = new JuegoMesa("Juego 2", 2022, 12, 3, material2);
		
		// Creamos dos objetos de tipo Comic
		
		Comic comic1 = new Comic("Spider-man", 2019, 6, 5, "Superheroes", "Marvel", 150);
		Comic comic2 = new Comic("Superman", 2021, 8, 5, "Superheroes", "DC comics", 210);
		
		// Añadimos los dos juegos creados al array de productos
		System.out.println("AÑADIREMOS CUATRO PRODUCTOS (2 juegos de mesa y 2 comics):\n");
		
		factura.addProducto(juego1);
		factura.addProducto(juego2);
		factura.addProducto(comic1);
		factura.addProducto(comic2);
		
		System.out.println();
		
		System.out.println("IMPRIMIREMOS LA FACTURA CORRESPONDIENTE: \n");
		factura.imprimirFactura();

	}

}
