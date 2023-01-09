/**
 * 
 */
package Tema3;

/**
 * @author IvanSM
 *
 */
public class Ej09Relacion3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//int mi variable; // No es valido ya que tiene un espacio.
		int num_de_cte = 5 ; // Es valido por que usa _ como espacios.
		String ____programa = "hola"; //Es valido ya que puede empezar con _.
		String $alguna = "Buenas"; 	//Es valido ya que puede empezar por el simbolo $.
		//int 3tema = 3; // No es valido por que empieza con un numero
		//String cierto? = "Si" ; //No es valido no acepta el simbolo ?.
		int numerodeCliente = 65214896; // Es valido por que empieza en minuscula no hay espacios.
		//String  jose~ ="Joselito"; //No es valido no acepta el simbolo ~.
		String ano = "ano"; //Es valido.
		double PI = 3.14159265359; //Es valido pero las variables es mejor en minusculas
		//int int = 20; //No es valido por que int es una palabra reservada.
		
		
	
		
		System.out.println(num_de_cte + " " + ____programa + " " + $alguna + " " + numerodeCliente + " " + ano + " " + PI);
		
		
	}

}
