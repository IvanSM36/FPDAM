package Tema9.Interfaces.Relacion1.Ejer01;

public class Main {

	public static void main(String[] args) {
		//Creo el objeto array
		ArrayReales arr1 = new ArrayReales();
		
		//Rellenamos el objeto array con el metodo numeros Randoms numRandom
		arr1.numRandom();
		
		System.out.println("El contenido del array es:");
		System.out.println(arr1.toString());
		System.out.println();
		System.out.print("El minimo del array es: " + arr1.minimo());
		System.out.println();
		System.out.println("El maximo del array es: " + arr1.maximo());
		System.out.println();
		System.out.println("La suma total del array es: " + arr1.sumatorio());
	}

}
