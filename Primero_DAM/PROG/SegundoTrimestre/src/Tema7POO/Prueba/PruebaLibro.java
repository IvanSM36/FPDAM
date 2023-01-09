package Tema7POO.Prueba;

public class PruebaLibro {

	public static void main(String[] args) {

		Libro lib = new Libro();
		Libro miLibrito = new Libro();
		Libro quijote = new Libro("NuevoISBN", "Quijote", "Cervantes", 300);

		// Llamada al primer constructor
		System.out.println("El isbn de mi libro es: " + miLibrito.isbn);
		System.out.println("El titulo de mi libro es: " + miLibrito.titulo);
		System.out.println("El autor de mi libro es: " + miLibrito.autor);
		System.out.println("El numero de paginas de mi libro es: " + miLibrito.numeroPag);
	
		System.out.println("************************************************************");
		
		// Llamada al segundo constructor	
		System.out.println("El isbn de mi libro es: " + quijote.isbn);
		System.out.println("El titulo de mi libro es: " + quijote.titulo);
		System.out.println("El autor de mi libro es: " + quijote.autor);
		System.out.println("El numero de paginas de mi libro es: " + quijote.numeroPag);
	}
}
