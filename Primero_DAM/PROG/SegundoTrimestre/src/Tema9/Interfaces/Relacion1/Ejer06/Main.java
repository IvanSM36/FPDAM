package Tema9.Interfaces.Relacion1.Ejer06;

public class Main {

	public static void main(String[] args) {

		Gato g1 = new Gato();
		Loro l1 = new Loro();
		
		g1.moverse();
		g1.PuedeCaminar();
		g1.PuedeNadar();
		System.out.println();
		l1.PuedeCaminar();
		l1.PuedeNadar();
		
	}

}
