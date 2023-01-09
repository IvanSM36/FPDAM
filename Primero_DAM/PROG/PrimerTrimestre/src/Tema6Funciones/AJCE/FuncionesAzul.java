package Tema6Funciones.AJCE;

public class FuncionesAzul {
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
	 * Indica si el numero introducido es primo o no
	 * @param int
	 * @return boolean
	 */
	public static boolean esPrimo(int num) {
		boolean primo = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0 && primo == true)
				primo = false;
		}
		return primo;
	}
	/*
	 * Muestra el siguiente numero primo al introducido
	 * @param int
	 * @return int
	 */
	public static int siguientePrimo(int num) {
		int nextPrimo = num;
		if(esPrimo(num)) {
			do {
				nextPrimo ++;			
			}while(!esPrimo(nextPrimo));
		}
		return nextPrimo;
	}
	/*
	 * Calcula la potencia dada una base y un exponente
	 * @param int int
	 * @return int
	 */
	public static int potencia(int base, int expo) {
		int potencia = 1;
		for (int i = 0; i < expo; i++) {
			potencia = potencia * base;
		}
		return potencia;
	}
	/*
	 * Cuenta los digitos del numero introducido
	 * @param int
	 * @return int
	 */
	public static int digitos(int num) {
		int i = 0;
		for (i = 1; num >= 10; i++) {
			num /= 10;
		}
		return i;
	}

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

	public static int digitoN(int num, int num2) {
		int i = 0;
		for (i = num2; num >= 10; i++) {
			num /= 10;
		}
		return i;
	}

	public static void posicionDigito() {

	}

	public static void quitarPorDetras() {

	}

	public static void quitarPorDelante() {

	}

	public static void pegaPorDetras() {

	}

	public static void pegaPorDelante() {

	}

	public static void trozoDeNumero() {

	}

	public static void juntaNumeros() {

	}
}
