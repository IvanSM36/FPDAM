/**
 * 
 */
package ExamenPOO.Ejer01;

import java.util.Arrays;

/**
 * @author IvanSM
 *
 */
public class Participantes {

	// Atributos
	// Creo un contenedor con los participantes con un array
	private Corredor[] participante;
	private int contadorParticipantes = 0;

	// Constructores
	// Por defecto
	public Participantes() {
		this.participante = new Corredor[5];
	}

	// Getters and Setters
	public Corredor[] getParticipante() {
		return participante;
	}

	public void setParticipante(Corredor[] participante) {
		this.participante = participante;
	}

	public int getContadorParticipantes() {
		return contadorParticipantes;
	}

	public void setContadorParticipantes(int contadorParticipantes) {
		this.contadorParticipantes = contadorParticipantes;
	}

	// Metodos
	// Metodo auxiliar
	/**
	 * Metodo auxiliar que devuelve el numero de corredores que hay dentro del array
	 * 
	 * @return Numero de corredores
	 */
	private int contarParticipantes() {
		int numParticipantes = 0;

		for (int i = 0; i < participante.length; i++) {
			if (participante[i] != null) {
				numParticipantes++;
			}
		}

		return numParticipantes;
	}

	// Inscribir al corredor siempre que sea posible
	public void inscribir(Corredor x) {
		boolean vacio = false;

		if (contadorParticipantes < participante.length) {
			for (int i = 0; i < participante.length && !vacio; i++) {
				if (participante[i] == null) { // controlo los nulos
					participante[i] = x;// Inserto participante
					contadorParticipantes++;// sumo al contador un Participante
					vacio = true; // Lo vuelvo true por que se a ocupado con un participante
				}
			}

			if (vacio) {
				System.out.println("Se ha añadido el participante");
			}
		} else {
			System.out.println("El evento esta completo.");
		}
	}

	// Dar de baja a un corredor en cuestión.
	public void baja(Corredor x) {
		boolean fin = false;
		int pos = 0;
		int numCorredores = contarParticipantes();

		if (numCorredores == 0) {
			System.out.println("CARRERA VACIA!! No se puede eliminar ningun corredor");
			fin = true;
		}

		while (fin == false && pos < participante.length) {

			if (participante[pos] != null) {
				if (participante[pos].equals(x)) {
					participante[pos] = null;
					System.out.println("Se ha dado de baja al participante.");
					fin = true;
				} else {
					pos++;
				}
			} else {
				pos++;
			}
		}
	}

	// Insertar la marca del corredor por teclado.
	public void insertarMarca(Corredor corredor, int marca) {
		boolean fin = false;
		int pos = 0;
		int numCorredores = contarParticipantes();

		if (numCorredores == 0) {
			System.out.println("CARRERA VACIA!! No se puede eliminar ningun corredor");
			fin = true;
		}

		while (fin == false && pos < participante.length) {

			if (participante[pos] != null) {
				if (participante[pos].equals(corredor)) {
					participante[pos].setMarcaConseguida(marca);
					System.out.println("Se ha insertado nueva marca.");
					fin = true;
				} else {
					pos++;
				}
			} else {
				pos++;
			}
		}
	}

	/**
	 * Determinar cuál ha sido el corredor que obtiene el oro: Metodo quer devuelve
	 * el nombre y el primer apellido del corredor con la marca más alta
	 */
	public void obtieneOro() {
		int min = 500000000; // Ponemos un maximo de minutos imposible para una carrera
		int posArrayPrimero = -1;

		for (int i = 0; i < participante.length; i++) {
			if (participante[i] != null) {
				if (participante[i].getMarcaConseguida() < min) {
					min = participante[i].getMarcaConseguida();
					posArrayPrimero = i;
				}
			}
		}

		if (posArrayPrimero != -1) {
			System.out.println("El corredor que obtiene el oro es: " + participante[posArrayPrimero].getNombre() + " "
					+ participante[posArrayPrimero].getApellido1() + " con una marca de "
					+ participante[posArrayPrimero].getMarcaConseguida() + " minutos.");
		}
	}

	@Override
	public String toString() {
		return "Participantes" + "\n--------------" + "\nParticipante = " + Arrays.toString(participante);
	}
	
	
}
