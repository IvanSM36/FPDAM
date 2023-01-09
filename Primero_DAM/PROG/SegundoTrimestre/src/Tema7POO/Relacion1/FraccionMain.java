/**
 * 
 */
package Tema7POO.Relacion1;

/**
 * @author IvanSM
 *
 */
public class FraccionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Fraccion f1 = new Fraccion(-7, 8);
		System.out.println(f1 + " x 5 = " + f1.multiplica(5));	
		System.out.println(f1 + " invertido = " + f1.invierte());
		
		Fraccion f2 = new Fraccion(3, 5);
		System.out.println(f1 + " x " + f2 + " = " + f2.multiplicaFrac(f2));	
		System.out.println(f1 + " : " + f2 + " = " + f1.divideFrac(f2));
		System.out.println(f1 + " : 5 = " + f1.divide(5));
		
		Fraccion f3 = new Fraccion(910, -350);
		//System.out.println(f3 + " = " + f3.simplifica());

	}

}
