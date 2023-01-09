/**
 * 
 */
package Tema6Funciones.AJCE;

/**
 * @author IvanSM
 *
 */
public class Ej16Pag166 {
	/*
	 * Indica si el parmetro es capicua
	 * @param int
	 * @return boolean
	 */
	public static boolean esCapicua(int num) {
		boolean capicua = false;
		if(num == voltea(num)) {
			capicua = true;
		} 
		return capicua;
	}
	/*
	 * Voltea el numero introducido
	 * @param int
	 * @return boolean
	 */
	public static int voltea(int num) {
		int invertido = 0;
		int resto;
		while (num > 0) {
			resto = num % 10;
			invertido = invertido * 10 + resto;
			num /= 10;
		}
		return invertido;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 99999; i++) {
			if(esCapicua(i))
				System.out.println(i);
		}

	}

}
