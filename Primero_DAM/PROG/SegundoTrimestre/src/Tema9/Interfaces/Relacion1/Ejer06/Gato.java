package Tema9.Interfaces.Relacion1.Ejer06;

public class Gato extends Mamifero implements Capacidad {

	public Gato() {
		// TODO Auto-generated constructor stub
	}
	
	//Metodos
	@Override
	public void PuedeCaminar() {
		System.out.println("El gato puede caminar.");	
	}

	@Override
	public void PuedeNadar() {
		System.out.println("El gato puede nadar.");		
	}

}
