package Tema9.Interfaces.Relacion1.Ejer02;

public class Main {

	public static void main(String[] args) {
		Libro lib1 = new Libro(12354, "La Ruta Prohibida", "2007");
		Libro lib2 = new Libro(65897, "Narnia", "2010");
		Libro lib3 = new Libro(56489, "Bruja Escarlata", "2018");
		Revista rev1 = new Revista(45896, "Motocross", "2020", 012);
		Revista rev2 = new Revista(56985, "Deportes", "2022", 013);
		Revista rev3 = new Revista(56895, "National Geographic", "2021", 014);
		
		System.out.println(lib1);
		System.out.println(lib2);
		System.out.println(lib3);
		System.out.println(rev1);
		System.out.println(rev2);
		System.out.println(rev3);
		
		lib1.presta();
		System.out.println(lib1);
		
		if(lib1.estaPrestado()) {
			System.out.println("El libro esta prestado");
		}
		
		//Prestamos el libro2
		lib2.presta();
		System.out.println(lib2);
		//Devolvemos el libro 2
		lib2.devuelve();
		System.out.println(lib2);
		
	}

}
