package Tema6Funciones.Bird.Funciones;

import java.util.Scanner;

public class Funciones {
	// Funciones
	/**
	 * Comprueba el maximo de 3 parametros
	 * 
	 * @param int int
	 * @return int
	 */
	public static void entre(int a, int b) {
		int mayor;
		int menor;
		if (a > b) {
			mayor = a;
			menor = b;
		} else {
			mayor = b;
			menor = a;
		}
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}

	/**
	 * Comprueba el maximo de 3 parametros
	 * 
	 * @param int int
	 * @return int
	 */
	public static void doble(int num) {
		int doble = 2 * num;
		System.out.println("El doble de " + num + " es: " + doble);
	}

	/**
	 * area o volumen cilindro
	 * 
	 * @param double double
	 * @return double
	 */
	public static void areaOvolCilindro(double radio, double altura, char opcion) {

		double volumen, area;
		switch (opcion) {
		case 'v':
			volumen = Math.PI * radio * radio * altura; // radio*radio es el radio al cuadrado
			System.out.println("El volumen es de: " + volumen);
			break;
		case 'a':
			area = 2 * Math.PI * radio * altura + 2 * Math.PI * radio * radio;
			System.out.println("El área es de: " + area);
			break;
		default:
			System.out.println("Indicador del cálculo erróneo");
		}
	}

	/**
	 * area y volumen cilindro
	 * 
	 * @param double double
	 * @return double
	 */
	public static double[] areaVolCilindro(double radio, double altura) {
		double volumen, area;
		double calculo[];

		calculo = new double[2]; // [0] para el volumen y [1] para el área
		calculo[0] = Math.PI * radio * radio * altura; // radio*radio es el radio al cuadrado

		calculo[1] = 2 * Math.PI * radio * altura + 2 * Math.PI * radio * radio;
		return (calculo);
	}

	/**
	 * Numeros primos
	 * 
	 * @param int
	 * @return boolean
	 */
	public static boolean esPrimo(int num) {
		boolean primo;
		primo = true; // suponemos que el n�mero es primo
		// este algoritmo se puede mejorar sabiendo que si un n�mero no es
		// divisible entre 2 y su ra�z cuadrada, entonces ya no ser� divisible
		// por ning�n otro n�meros -> ser� primo
		for (int i = 2; i < num; i++) {
			if (i < num && primo == true) {
				if (num % i == 0) { // si es divisible
					primo = false; // si hemos entrado aqu� significa que el n�mero no es primo
				}
			}
		}
		return (primo);
	}
	public static void primos_anteriores(int n){
        int i;
        boolean num_primo;

        System.out.println("LOS NUMEROS PRIMOS ANTERIORES A " + n + " SON : ");
        for(i=1;i < n;i++){
        	num_primo = esPrimo(i);
            
            if(num_primo == true){
                System.out.println("NUMERO PRIMO : " + i);
            }
        }
    }

	/**
	 * Numeros primos
	 * 
	 * @param int
	 * @return boolean
	 */
	public static int sumaDivisoresPropios(int num) { // Se puede usar para numeros amigos.
		int suma = 0;
		for (int i = 0; i < num; i++) {
			if (num % i == 0) {
				suma += i;
			}
		}

		return suma;
	}

	/**
	 * Muestra el seno coseno y tangente de un angulo
	 * 
	 * @param double
	 * @return
	 */
	public static void infoAngulos(double num) {

		num = Math.toRadians(num);

		System.out.println("Seno: " + Math.sin(num));
		System.out.println("Coseno: " + Math.cos(num));
		System.out.println("Tangente: " + Math.tan(num));
	}

	/**
	 * Rellena un array
	 * 
	 * @param double
	 * @return
	 */
	public static int rellenaArrayPares(int t[]) {
		int contador =0;
		for (int i = 0; i < t.length; i++) {
			System.out.print("Introduzca un numero: ");
			int num = pideNumeros(0);
			if(pares(num)){
				t[i] = num;
			} else {
				contador++;
			}
		}
		return contador;
	}
	/** Pide numeros
	 * 
	 * 
	 * @param double
	 * @return
	 */
	public static int pideNumeros(int num) {
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		return num;
	}
	/**
	 * Indica si el numero es par o no.
	 * 
	 * @param int
	 * @return boolean
	 */
	public static boolean pares(int num) {
		boolean pares = false;
		if (num % 2 == 0) {
			pares = true;
		}
		return pares;
	}
	/** Cuenta impares introducidos
	 * @param int
	 * @return int 
	 */
	public static int cuentaImpares(int num) {	
		int contaImpares = 0;
		if (num % 2 != 0) {
			contaImpares ++;
		}
		return contaImpares;
	}
	/** Muestra un array relleno de numeros aleatorios.
	 * @param int
	 * @return
	 */
	public static void arrayRandom (int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("Contenido del array");
		System.out.println("-------------------");
		System.out.print("Indice ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4s", i );	
		}
		System.out.println();
		System.out.print("Valor  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4s", arr[i]);	
		}
		System.out.println();
		System.out.println();
	}
	/** Muestra un array relleno de numeros aleatorios.
	 * @param int int[]
	 * @return boolean
	 */
	public static boolean buscaNum(int num, int arr[]) {
		boolean encontrado = false;
		
		for (int i = 0; i < arr.length; i++) {
			if(num == arr[i]) 
				encontrado = true;		
		}		
		return encontrado;
	}
	public static void mostrarArray(int arr[]) {
		System.out.println("Contenido del array");
		System.out.println("-------------------");
		System.out.print("Indice ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4s", i );	
		}
		System.out.println();
		System.out.print("Valor  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4s", arr[i]);	
		}
		System.out.println();
		System.out.println();
	}
	public static int leer_numero(String nombre_numero){
        Scanner scan = new Scanner(System.in);
		int numero;
        System.out.print("Indique el " + nombre_numero + " : ");
        numero = scan.nextInt();

        return numero;
    }
    
    /**
     * Método que pide al usuario los datos de la matriz para rellenarla
     * @param int, int, String
     * @return int[][]
     * 
     * */
    public static int[][] leer_matriz(int n, int m, String nombre_matriz) {
        Scanner scan = new Scanner(System.in);
    	int i,j;
        int[][] matriz;

        matriz = new int[n+1][m+1];
        System.out.println("\nIndique los valores de la " + nombre_matriz + " : \n");
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                System.out.print("Indique el valor [" + i + "][" + j + "] : ");
                matriz[i][j] = scan.nextInt();
            }
        }

        return matriz;
    }
    
    /**
     * Método que suma dos matrices
     * @param int[][], int[][], int, int
     * @return int[][]
     * 
     * */
    public static int[][] sumar_matrices(int[][] matriz_01, int[][] matriz_02, int n, int m){
        int[][] matriz_suma;
        int i,j;

        matriz_suma = new int[n+1][m+1];

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                matriz_suma[i][j] = matriz_01[i][j] + matriz_02[i][j];
            }
        }

        return matriz_suma;
    }
    
    
    /**
     * Método que imprime los elementos de una matriz
     * @param int[][], int, int
     * @return 
     * 
     * */
    public static void imprimir_matriz_suma(int[][] matriz_suma,int n, int m){
        int i,j;

        System.out.println("\nLOS VALORES DE LA MATRIZ SUMA SOM : \n" );
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                System.out.println("MATRIZ SUMA [" + i + "][" + j + "] : " + matriz_suma[i][j]);
            }
        }
    }
}
