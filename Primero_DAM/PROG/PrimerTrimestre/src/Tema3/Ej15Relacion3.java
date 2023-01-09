/**
 * 
 */
package Tema3;

/**
 * @author IvanSM
 *
 */
public class Ej15Relacion3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final int radio = 1;
		double diametro = 15.5;
		double altura = 42.4;
		double area = 2 * (Math.PI) * (radio + altura);
		double volumen = Math.PI * (radio * radio) * altura;
		
		System.out.println("El area del cilindro es: " + area);
		System.out.println("El volumen del cilindro es: " + altura);
		
	}

}
