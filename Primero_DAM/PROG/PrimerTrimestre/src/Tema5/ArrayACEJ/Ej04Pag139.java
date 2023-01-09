/**
 * 
 */
package Tema5.ArrayACEJ;

/**
 * @author IvanSM
 *
 */
public class Ej04Pag139 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numero[] = new int[20];
		int cuadrado[] = new int[20];
		int cubo[] = new int[20];
		
		//Rellenamos el array numeros con numeros randoms.
		for(int i = 0; i < numero.length; i++) {
			numero[i]= ((int)Math.random()*101);
		}
		
		//Cargamos el array cuadrado
		for (int i = 0; i < cuadrado.length;i++) {
			cuadrado[i] = numero[i] * numero[i];
		}
		
		//Cargamos el array cubo
		for (int i = 0; i < cubo.length;i++) {
			cubo[i] = cuadrado[i] * numero[i];
		}
		
		//Mostramos los Arrays 
		for (int i = 0; i< numero.length; i++) {
			System.out.println(numero[i]);
			//System.out.println(cuadrado[i]);
			//System.out.println(cubo[i]);
		}
		
	}

}
