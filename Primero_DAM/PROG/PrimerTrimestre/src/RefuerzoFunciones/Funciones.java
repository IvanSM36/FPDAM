package RefuerzoFunciones;

import java.util.Scanner;

public class Funciones {
	// variables inicializadas
	public static int[] arr = new int[10];	
	public static int[] primos = new int[0];
	public static int contaPrimos = 0;
	public static int indice;
	public static  int newValor ;
	public static Scanner scan = new Scanner(System.in);
	
	/* Muestra un menu y retorna la opcion a elegir.
	 * @param 
	 * @return int
	 */
	public static int menu() {
		System.out.println("Menu");
		System.out.println("┌────────────────────────────────────────────────────────────────────┐");
		System.out.println("│ 1. Rellenar array.                                                 │");
		System.out.println("│ 2. Rellenar aleatoriamente.                                        │");
		System.out.println("│ 3. Borrar array.                                                   │");
		System.out.println("│ 4. Introducir o borrar elemento.                                   │");
		System.out.println("│ 5. Listar contenido.                                               │");
		System.out.println("│ 6. Mostrar los numeros primos.                                     │");
		System.out.println("│ 7. Calcular la media de los numeros primos.                        │");
		System.out.println("│ 8. Filtrar numeros iguales.                                        │");
		System.out.println("│ 9. Buscar elemento en el array.                                    │");
		System.out.println("│ 10. Mostrar numeros mayores a la suma de sus posiciones adyacentes │");
		System.out.println("│ 0. Salir.                                                          │");
		System.out.println("└────────────────────────────────────────────────────────────────────┘");
		System.out.println();
		System.out.print("Introduzca una opcion: ");
		int opcion = scan.nextInt();
		return opcion;
	}
	/* rellena un array con numeros introducidos. 
	 * @ param
	 * @ return
	 */
	public static void rellenarArray() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Introduzca un numero para el indice " + i + ": ");
			arr[i]= scan.nextInt();
		}
		visualizarArray(arr);
		System.out.println();
	}
	/* Visualiza los arrays. 
	 * @ param
	 * @ return
	 */	
	public static void visualizarArray(int arr[]) {
		System.out.println();
		System.out.println("Contenido del Array");
		System.out.println("-------------------");
		System.out.print("Indice: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%4s", i);
		}
		System.out.println();
		System.out.print("Valor:  ");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%4s", arr[i]);
		}
		System.out.println();
	}
	/* Visualiza los arrays. 
	 * @ param
	 * @ return
	 */	
	public static void visualizarArrayPrimos(int arr[]) {
		System.out.println();
		System.out.println("Contenido del Array");
		System.out.println("-------------------");
		System.out.print("Indice: ");
		for(int i = 0; i < primos.length; i++) {
			System.out.printf("%4s", i);
		}
		System.out.println();
		System.out.print("Valor:  ");
		for(int i = 0; i < primos.length; i++) {
			System.out.printf("%4s", primos[i]);
		}
		System.out.println();
	}
	/* Visualiza los arrays. 
	 * @ param
	 * @ return
	 */	
	public static void rellenarArrayRandom() {
		for(int i = 0; i < arr.length; i++) {		
			arr[i]= (int)(Math.random()*101);
		}
		visualizarArray(arr);
		System.out.println();
	}
	/* Visualiza los arrays. 
	 * @ param
	 * @ return
	 */	
	public static void borrarArray() {
		for(int i = 0; i < arr.length; i++) {		
			arr[i]= 0;
		}
		visualizarArray(arr);
		System.out.println();
	}
	/* Visualiza introduce o borra  un elemento. 
	 * @ param
	 * @ return
	 */	
	public static int introduceBorrar() {
		System.out.println();
		System.out.println("Submenu borrar o introducir");
		System.out.println("┌─────────────────────────────┐");
		System.out.println("│ 1. Borrar Elemento.         │");
		System.out.println("│ 2. Introducir elemento.     │");
		System.out.println("│ 0. Volver atras.            │");
		System.out.println("└─────────────────────────────┘");
		System.out.println();
		System.out.print("Introduzca una opcion: ");
		int opcion = scan.nextInt();
		return opcion;
	}
	/* Borra el elemento del array introducido por teclado. 
	 * @ param
	 * @ return
	 */	
	public static void borrarElemento() {
		System.out.print("Introduzca que indice quieres borrar.");
		indice = scan.nextInt();	
		arr[indice] = 0;
		visualizarArray(arr);
		System.out.println();
	}
	/* Borra el elemento del array introducido por teclado. 
	 * @ param
	 * @ return
	 */	
	public static void introducirElemento() {
		System.out.print("Introduzca que indice quieres modificar del 0 al 9:");
		indice = scan.nextInt();
		System.out.print("Introduzca que valor quieres introducir:");
		newValor = scan.nextInt();	
		arr[indice] = newValor;
		
		visualizarArray(arr);
		System.out.println();
	}
	/* Lista el contenido del array.
	 * @ param
	 * @ return
	 */	
	public static void listarContenido() {	
		visualizarArray(arr);
		System.out.println();
	}
	/* Lista el contenido de array primo
	 * @ param
	 * @ return
	 */	
	public static void listarPrimos() {	
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && esPrimo(arr[i])) {
				contaPrimos ++;
				primos = new int[contaPrimos];
				primos[i] = arr[i];
			}else {
				System.out.println("No hay primos.");
			}			
			
		}	
		visualizarArrayPrimos(primos);
		System.out.println();	
	}
	/* Indica si es primo.
	 * @ param int
	 * @ return boolean
	 */	
	public static boolean esPrimo(int num) {
		boolean primo = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0 && primo == true)
				primo = false;
		}
		return primo;
	}
}
