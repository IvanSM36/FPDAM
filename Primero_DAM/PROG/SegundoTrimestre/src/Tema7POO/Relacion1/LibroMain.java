/**
 * 
 */
package Tema7POO.Relacion1;

/**
 * @author IvanSM
 *
 */
public class LibroMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Libro narnia = new Libro(123546, "Narnia", "ElEscritor", 300);
		Libro spiderman = new Libro(128646, "Spider-Man", "ElEscritor", 200);
		
		System.out.println(narnia);
		System.out.println();
		System.out.println(spiderman);
		
		// llamo al metodo
		narnia.masPaginas(spiderman);
	}
	
}
