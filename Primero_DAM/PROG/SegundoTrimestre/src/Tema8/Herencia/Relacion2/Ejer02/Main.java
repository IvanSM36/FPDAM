package Tema8.Herencia.Relacion2.Ejer02;

public class Main {

	public static void main(String[] args) {

		Libro l1 = new Libro("Narnia", "JK");

		System.out.println(l1.toString());

		l1.setPrecio(15);

		l1.setTitulo("Señor de los Anillos");
		l1.setAutor("Tolkien");

		System.out.println(l1.toString());

		LibrosTextos lt1 = new LibrosTextos("Lengua", "T", 1);

		System.out.println(lt1.toString());

		lt1.setTitulo("Matematica");
		lt1.setAutor("H");
		lt1.setPrecio(10);
		lt1.setCurso(3);

		System.out.println(lt1.toString());

		LibroTextosUNC ltunc1 = new LibroTextosUNC("Fisica", "MA", 3, "A");

		System.out.println(ltunc1.toString());

		ltunc1.setTitulo("Matematica");
		ltunc1.setAutor("H");
		ltunc1.setPrecio(10);
		ltunc1.setCurso(3);
		ltunc1.setFacultad("MO");
		
		System.out.println(ltunc1.toString());
		
		Novela n1 = new Novela("Fisica", "MA", "Historia" );

		System.out.println(n1.toString());

		n1.setTitulo("Matematica");
		n1.setAutor("H");
		n1.setPrecio(10);
		n1.setTipo("Romantica");
		
		System.out.println(n1.toString());


	}

}
