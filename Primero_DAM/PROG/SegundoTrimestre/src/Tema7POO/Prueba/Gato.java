/**
 * 
 */
package Tema7POO.Prueba;

/**
 * @author IvanSM
 *
 */
public class Gato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		GatoSimple gato3 = new GatoSimple();
		
		// Gato1
		GatoSimple gato1 = new GatoSimple("macho");
		System.out.println("Hola gatito");
		gato1.maulla();
		System.out.println("Toma un poquito de tarta.");
		gato1.comer("tarta");
		System.out.println("Aquí tienes pescado");
		gato1.comer("pescado");
		
		//Gato2
		GatoSimple gato2 = new GatoSimple("macho");
		System.out.println("Toma sopa de verduras.");
		gato1.comer("sopa de verduras");
		System.out.println("Aquí tienes pescado");
		gato1.comer("pescado");
		
		//Gato3
		gato3.setSexo("hembra");
		
		System.out.println();
		//Se pelean
		System.out.println("Parece que se van a pelear.");		
		System.out.println("Los gatos maullan.");
		gato1.maulla();
		gato2.maulla();
		gato3.maulla();
		
		System.out.println("Se pelea el gato1 con el gato2");
		gato1.peleaCon(gato2);
		System.out.println("Se pelea el gato1 con el gato3");
		gato1.peleaCon(gato3);
		System.out.println("Se pelea el gato2 con el gato3");
		gato2.peleaCon(gato3);
	}

}
