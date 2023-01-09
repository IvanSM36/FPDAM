/**
 * 
 */
package Tema8.Abs.Relacion2.Ejer1;

import Tema8.Abs.Relacion2.Ejer3.Cuadrado;

/**
 * @author IvanSM
 *
 */
public class FiguraMain {

	/**
	 * Metodos @param args
	 */
	public static void main(String[] args) {
		
		//Creo el objeto circulo 
		Circulo c1 = new Circulo(3);
		//Muestro el area del circulo
		System.out.println("Area del circulo");
		System.out.println("----------------");
		System.out.println(c1.calcularArea());
		System.out.println();
		
		//Creo el objeto rectangulo
		Rectangulo r1 = new Rectangulo(5, 5);
		//Muestro el area del rectangulo.
		System.out.println("Area del rectangulo");
		System.out.println("------------------");
		System.out.println(r1.calcularArea());
		System.out.println();
		
		//Creo el objeto triangulo
		Triangulo t1 = new Triangulo(4,8);
		//Muestro el area del triangulo.
		System.out.println("Area del triangulo");
		System.out.println("------------------");
		System.out.println(t1.calcularArea());

	}

}
