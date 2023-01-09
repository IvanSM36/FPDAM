/**
 * 
 */
package Tema7POO.Prueba;

/**
 * @author IvanSM
 *
 */
public class CuboMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cubo cubito = new Cubo(5);
		Cubo cubote = new Cubo(10);
		
		cubito.setCapacidadActual(2);
		cubote.setCapacidadActual(7);
		
		System.out.println("Cubito");
		System.out.println(cubito.getCapacidadActual());
		cubito.pintarCubo();
		System.out.println();
		System.out.println("Cubote");
		System.out.println(cubote.getCapacidadActual());

		cubote.pintarCubo();
		System.out.println();
		System.out.println("LLeno el cubito");
		System.out.println(cubito.getCapacidadActual());

		cubito.llenarCubo();
		cubito.pintarCubo();
		
	}

}
