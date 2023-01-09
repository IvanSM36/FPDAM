/**
 * 
 */
package Tema7POO.Prueba;

/**
 * @author IvanSM
 *
 */
public class MisPerros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Perro miPerro = new Perro();
		miPerro.nombre = "Dina";
		miPerro.raza = "Husky";
		miPerro.edad = 1;
		miPerro.ladrar();
		miPerro.comer("jamon");
		miPerro.comer("Pienso");
		
	}

}
