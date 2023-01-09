/**
 * 
 */
package Tema7POO.Relacion2;

/**
 * @author IvanSM
 *
 */
public class NifMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Nif nif1 = new Nif();
	        nif1.leer();
	        nif1.mostrarNIF();

	        Nif nif2 = new Nif(45698235);
	        nif2.mostrarNIF();
	}

}
