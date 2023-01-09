package Tema9.Interfaces.Relacion1.Ejer06;

public class Loro implements Capacidad {

	public Loro() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void PuedeCaminar() {
		System.out.println("El loro puede caminar.");
	}

	@Override
	public void PuedeNadar() {
		System.out.println("El loro no puede nadar.");	
	}

}
