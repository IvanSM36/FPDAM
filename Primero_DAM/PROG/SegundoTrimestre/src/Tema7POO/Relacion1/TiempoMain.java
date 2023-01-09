/**
 * 
 */
package Tema7POO.Relacion1;

/**
 * @author IvanSM
 *
 */
public class TiempoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiempo t1 = new Tiempo(1, 20, 30);
		Tiempo t2 = new Tiempo(0, 30, 30);
		
		System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
		System.out.println(t1 + " - " + t2 + " = " + t1.resta(t2));

	}

}
