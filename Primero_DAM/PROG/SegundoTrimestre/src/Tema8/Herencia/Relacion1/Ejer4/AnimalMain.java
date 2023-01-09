/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer4;

/**
 * @author IvanSM
 *
 */
public class AnimalMain {

	/**
	 *  @param args
	 */
	public static void main(String[] args) {
		//Creo los objetos 
		Caballo caballito1 = new Caballo("Sebastian", "alpaca", 15);
		Perro perrito1 = new Perro("Kiara", "Pienso", 2);
		Gato gatito1 = new Gato("Michu", "Pienso", 2);
		
		System.out.println(caballito1);
		System.out.println();
		System.out.println(gatito1);
		System.out.println();
		System.out.println(perrito1);
	}

}
