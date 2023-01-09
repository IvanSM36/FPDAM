/**
 * 
 */
package RefuerzoMath;

/**
 * @author IvanSM
 *
 */
public class Ejercicio1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumaTirada = 0;
		int tirada;
		
		for(int i = 1; i <= 3 ; i++) {
			tirada = FuncionesMath.aleatorio(6);
			sumaTirada += tirada; 	
			System.out.println("Resultado del dado " + i + ": " + tirada);
		}
		System.out.print("La suma de los dados es: " + sumaTirada);
	}

}
