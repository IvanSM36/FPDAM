package Examen.T7POO.Ejer01;

import java.util.Arrays;

public class Corredores {

	// ATRIBUTOS

		public Corredor corredores[];

	// CONSTRUCTORES

		public Corredores() {
			this.corredores = new Corredor[5];
		}

	// GETTERS Y SETTERS

		public Corredor[] getCorredores() {
			return corredores;
		}

		public void setCorredores(Corredor[] corredores) {
			this.corredores = corredores;
		}

	// METODOS

		// Metodo auxiliar
		/**
		 * Metodo auxiliar que devuelve el numero de corredores que hay dentro del array
		 * 
		 * @return Numero de corredores
		 */
		private int contarCorredores() {
			int numCorredores = 0;

			for (int i = 0; i < corredores.length; i++) {
				if (corredores[i] != null) {
					numCorredores++;
				}
			}

			return numCorredores;
		}

		/**
		 * Metodo que añade un corredor nuevo al array corredores. Evalua si está
		 * completa y despues añade en un lugar vacio
		 * 
		 * @param corredor
		 */
		public void inscribir(Corredor corredor) {

			boolean fin = false;
			int pos = 0;
			int numCorredores = contarCorredores();

			if (numCorredores == corredores.length) {
				System.out.println("CARRERA COMPLETA!!");
				fin = true;
			}

			while (fin == false && pos < corredores.length) {

				if (corredores[pos] == null) {
					corredores[pos] = corredor;
					System.out.println("CORREDOR AÑADIDO");
					fin = true;
				} else {
					pos++;
				}
			}
		}

		/**
		 * Metodo que elimina a un corredor dado. Comprueba si aún no hay corredores,
		 * pero si el corredor introducido existe, lo elimina.
		 * 
		 * @param corredor
		 */
		public void baja(Corredor corredor) {

			boolean fin = false;
			int pos = 0;
			int numCorredores = contarCorredores();

			if (numCorredores == 0) {
				System.out.println("CARRERA VACIA!! No se puede eliminar ningun corredor");
				fin = true;
			}

			while (fin == false && pos < corredores.length) {

				if (corredores[pos] != null) {
					if (corredores[pos].equals(corredor)) {
						corredores[pos] = null;
						System.out.println("CORREDOR DADO DE BAJA");
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
		 * Metodo que inserta una marca al corredor dado
		 * 
		 * @param corredor
		 * @param marca
		 */
		public void insertarMarca(Corredor corredor, int marca) {

			boolean fin = false;
			int pos = 0;
			int numCorredores = contarCorredores();

			if (numCorredores == 0) {
				System.out.println("CARRERA VACIA!! No se puede eliminar ningun corredor");
				fin = true;
			}

			while (fin == false && pos < corredores.length) {

				if (corredores[pos] != null) {
					if (corredores[pos].equals(corredor)) {
						corredores[pos].setMarca(marca);
						System.out.println("MARCA CAMBIADA!!");
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
		 * Metodo quer devuelve el nombre y el primer apellido del corredor con la marca
		 * más alta
		 */
		public void obtieneOro() {

			int min = 500000000; // Ponemos un maximo de minutos imposible para una carrera
			int posArrayPrimero = -1;

			for (int i = 0; i < corredores.length; i++) {
				if (corredores[i] != null) {
					if (corredores[i].getMarca() < min) {
						min = corredores[i].getMarca();
						posArrayPrimero = i;
					}
				}
			}

			if (posArrayPrimero != -1) {
				System.out.println("El corredor que obtiene el oro es: " + corredores[posArrayPrimero].getNombre() + " "
						+ corredores[posArrayPrimero].getApellido1() + " con una marca de "
						+ corredores[posArrayPrimero].getMarca() + " minutos.");
			}
		}

		/**
		 * Metodo toString
		 */
		@Override
		public String toString() {
			return "Corredores [corredores=" + Arrays.toString(corredores) + "]";
		}

	

		

	}
