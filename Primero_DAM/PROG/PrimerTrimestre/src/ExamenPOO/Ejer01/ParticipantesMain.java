package ExamenPOO.Ejer01;

public class ParticipantesMain {

	public static void main(String[] args) {
		// Definimos los corredores

		Corredor corredor1 = new Corredor("Maria", "Torres", "Grande", 20, 'M');
		Corredor corredor2 = new Corredor("Luis", "Periquito", "Perez", 20, 'H');
		Corredor corredor3 = new Corredor("Jorge", "Lopez", "Garcia", 20, 'H');
		Corredor corredor4 = new Corredor("Sara", "Rodriguez", "Lopez", 20, 'M');
		Corredor corredor5 = new Corredor("Julia", "Sanchez", "Campos", 20, 'M');
		Corredor corredor6 = new Corredor("Ana", "Garcia", "Martin", 20, 'H');

		// Definimos el array de corredores

		Participantes carrera = new Participantes();

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
		carrera.insertarMarca(corredor2, 20);
		carrera.insertarMarca(corredor1, 45);

		// Comprobando oro
		System.out.println("\nMOSTRANDO ORO:\n");
		carrera.obtieneOro();
	}

}
