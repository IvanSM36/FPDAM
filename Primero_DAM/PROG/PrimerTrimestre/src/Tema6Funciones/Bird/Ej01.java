/**
 * 
 */
package Tema6Funciones.Bird;

import java.util.Scanner;

import Tema6Funciones.Bird.Funciones.Funciones;

/**
 * @author IvanSM
 *
 */
public class Ej01 {

	/**
	 * @param args
	 */
	 //Ejecutamos el programa
    public static void main(String[] args){
        int[][] matriz_01,matriz_02,matriz_suma;
        int n,m;

        Scanner scan = new Scanner(System.in);

        n = Funciones.leer_numero("valor de n");//Leemos el número de filas
        m = Funciones.leer_numero("valor de m");//Leemos el número de columnas

        matriz_01 = Funciones.leer_matriz(n,m,"matriz 01");//Rellena la primera matriz
        matriz_02 = Funciones.leer_matriz(n,m,"matriz 02");//Rellena la segunda matriz

        matriz_suma = Funciones.sumar_matrices(matriz_01,matriz_02,n,m);//Suma las dos matrices

        Funciones.imprimir_matriz_suma(matriz_suma,n,m);//Imprime la suma de las matrices
    }

}
