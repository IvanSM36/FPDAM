package Examen.T7POO.Ejer01;

public class TestCorredores {
	public static void main(String[] args) {

		// Definimos los corredores

		Corredor corredor1 = new Corredor("Ivan", "Figueroa", "Morillo", 20, "hombre");
		Corredor corredor2 = new Corredor("Luis", "Perez", "Perez", 20, "hombre");
		Corredor corredor3 = new Corredor("Juan", "Lopez", "Garcia", 20, "hombre");
		Corredor corredor4 = new Corredor("Maria", "Rodriguez", "Lopez", 20, "mujer");
		Corredor corredor5 = new Corredor("Alfredo", "Sanchez", "Campos", 20, "hombre");
		Corredor corredor6 = new Corredor("Antonio", "Garcia", "Garcia", 20, "hombre");

		// Definimos el array de corredores

		Corredores carrera = new Corredores();

		// PRUEBAS

		// Añadimos corredores
		System.out.println("AÑADIENDO CORREDORES:\n");
		carrera.inscribir(corredor1);
		carrera.inscribir(corredor2);
		carrera.inscribir(corredor3);
		carrera.inscribir(corredor4);
		carrera.inscribir(corredor5);

		// Introducimos un corredor de más
		carrera.inscribir(corredor6);

		// Eliminando corredores
		System.out.println("\nELIMINANDO CORREDORES:\n");
		carrera.baja(corredor5);
		carrera.baja(corredor4);
		carrera.baja(corredor3);

		// Insertar marcas
		System.out.println("\nINSERTANDO MARCAS:\n");
		carrera.insertarMarca(corredor2, 50);
		carrera.insertarMarca(corredor1, 75);

		// Comprobando oro
		System.out.println("\nMOSTRANDO ORO:\n");
		carrera.obtieneOro();
	}

}
