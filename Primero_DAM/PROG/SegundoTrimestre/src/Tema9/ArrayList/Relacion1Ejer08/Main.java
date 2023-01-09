package Tema9.ArrayList.Relacion1Ejer08;

public class Main {

	public static void main(String[] args) {

		Figuras figuras = new Figuras();
		figuras.annade(new Circulo(3.456));
		figuras.annade(new Triangulo(3.456, 2.17));
		figuras.annade(new Cuadrado(2.11));
		if (!figuras.annade(new Triangulo(3.12, 5.6), 7)) {
			System.out.println("Error al borrar");
		}
		figuras.lista();
		figuras.borra(0);
		figuras.borra(33);
		System.out.println("---------------------");
		figuras.lista();

	}

}
