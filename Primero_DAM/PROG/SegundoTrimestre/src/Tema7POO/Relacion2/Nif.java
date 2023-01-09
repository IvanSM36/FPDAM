/**
 * 
 */
package Tema7POO.Relacion2;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class Nif {

	/**
	 * Atributos
	 */
	private int numero;
	private char letra;
	
	///// Constructores /////
	// Por defecto
	public Nif() {
		this.numero = 0;
		this.letra = ' ';
	}
	
	public Nif(int dni) {
		this.numero = dni;
		letra = calcularLetra();
	}
	///// Getters and Setters /////

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	///// Metodos /////
    //Método para calcular la letra del NIF
	private char calcularLetra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};                      
        return letras[numero % 23];
    }
	
	public void leer() {
		 Scanner scan = new Scanner(System.in);
	        do {
	            System.out.print("Introduce dni: ");
	            numero = scan.nextInt();
	        } while (numero <= 0);
	        letra = calcularLetra();
	}
	
	public void mostrarNIF() {
		System.out.println("Nif " + numero + "-" + letra );
	}
	
}
