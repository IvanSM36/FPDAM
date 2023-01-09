package Examen.T7POO.Ejer02;
import java.util.Scanner;

public class GrupoDepositos {

// ATRIBUTOS

	private static Scanner consola = new Scanner(System.in);

	private int numDepositos;
	private String idGrupo;

// CONSTRUCTORES

	/**
	 * Dentro de este constructor se define un switch que evalua el numero de
	 * depositos introducidos. Si el numero de depositos es 2 o 3, pedirá por
	 * consola los valores necesarios para formar un objeto Deposito. Si el numero
	 * de depositos es 2 o 3, muestra el ID de cada deposito y el volumen de los
	 * mismos.
	 * 
	 * @param numDepositos
	 * @param idGrupo
	 */
	public GrupoDepositos(int numDepositos, String idGrupo) {

		switch (numDepositos) {

		case 1:
			System.out.println("Un grupo debe tener más de un depósito");
			break;

		case 2:
			System.out.print("Introdúzca el diametro del primer depósito: ");
			double d1 = consola.nextDouble();
			System.out.print("Introdúzca la altura del primer depósito: ");
			double h1 = consola.nextDouble();
			System.out.print("Introdúzca el id del primer depósito: ");
			String id1 = consola.next();
			System.out.println();
			System.out.print("Introdúzca el diametro del segundo depósito: ");
			double d2 = consola.nextDouble();
			System.out.print("Introdúzca la altura del segundo depósito: ");
			double h2 = consola.nextDouble();
			System.out.print("Introdúzca el id del segundo depósito: ");
			String id2 = consola.next();

			Deposito deposito1 = new Deposito(d1, h1, id1);
			Deposito deposito2 = new Deposito(d2, h2, id2);

			System.out.println("\nIDENTIFICADORES DEL GRUPO DE DEPOSITOS " + idGrupo + ":");
			System.out.println("Id:" + deposito1.getIdentificador() + " | Volumen: ");
			System.out.printf("%.2f", deposito1.volumen());
			System.out.println("\nId:" + deposito2.getIdentificador() + " | Volumen: ");
			System.out.printf("%.2f", deposito2.volumen());
			break;

		case 3:
			System.out.print("Introdúzca el diametro del primer depósito: ");
			double d3 = consola.nextDouble();
			System.out.print("Introdúzca la altura del primer depósito: ");
			double h3 = consola.nextDouble();
			System.out.print("Introdúzca el id del primer depósito: ");
			String id3 = consola.next();
			System.out.println();
			System.out.print("Introdúzca el diametro del segundo depósito: ");
			double d4 = consola.nextDouble();
			System.out.print("Introdúzca la altura del segundo depósito: ");
			double h4 = consola.nextDouble();
			System.out.print("Introdúzca el id del segundo depósito: ");
			String id4 = consola.next();
			System.out.println();
			System.out.print("Introdúzca el diametro del tercer depósito: ");
			double d5 = consola.nextDouble();
			System.out.print("Introdúzca la altura del tercer depósito: ");
			double h5 = consola.nextDouble();
			System.out.print("Introdúzca el id del tercer depósito: ");
			String id5 = consola.next();

			Deposito deposito3 = new Deposito(d3, h3, id3);
			Deposito deposito4 = new Deposito(d4, h4, id4);
			Deposito deposito5 = new Deposito(d5, h5, id5);

			System.out.println("\nIDENTIFICADORES DEL GRUPO DE DEPOSITOS " + idGrupo);
			System.out.println("Id:" + deposito3.getIdentificador() + " | Volumen: ");
			System.out.printf("%.2f", deposito3.volumen());
			System.out.println("\nId: " + deposito4.getIdentificador() + " | Volumen: ");
			System.out.printf("%.2f", deposito4.volumen());
			System.out.println("\nId: " + deposito5.getIdentificador() + " | Volumen: ");
			System.out.printf("%.2f", deposito5.volumen());
			break;

		default:
			System.out.println("No se admiten más depositos");
			break;
		}
	}

// GETTERS Y SETTERS

	public int getNumDepositos() {
		return numDepositos;
	}

	public void setNumDepositos(int numDepositos) {
		this.numDepositos = numDepositos;
	}

	public String getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(String idGrupo) {
		this.idGrupo = idGrupo;
	}

}
