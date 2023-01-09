package ExamenT7POO2.Ejercicio01;

public class GrupoCoche {

	// Atributos
	// Creo un contenedor con los participantes con un array
	private Coche[] vehiculo;
	private int contadorVehiculo = 0;

	// Constructores
	// Por Defecto
	public GrupoCoche() {
		this.vehiculo = new Coche[200];
	}

	// Constructor para meter el tamanio del array que queramos
	public GrupoCoche(int numVehiculos) {
		this.vehiculo = new Coche[numVehiculos];
	}

	// Getters and Setters
	public Coche[] getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Coche[] vehiculo) {
		this.vehiculo = vehiculo;
	}

	// Metodos

	// Metodo auxiliar
	/**
	 * Metodo auxiliar que devuelve el numero de coches que hay dentro del array
	 * 
	 * @return Numero de coches
	 */
	private int contarParticipantes() {
		int numParticipantes = 0;
		for (int i = 0; i < vehiculo.length; i++) {
			if (vehiculo[i] != null) {
				numParticipantes++;
			}
		}
		return numParticipantes;
	}

	// Dar de alta al coche en cuanto entre en el taller.
	public void altaCoche(Coche coche) {
		boolean vacio = false;

		if (contadorVehiculo < vehiculo.length) {
			for (int i = 0; i < vehiculo.length && !vacio; i++) {
				if (vehiculo[i] == null) { // controlo los nulos
					vehiculo[i] = coche;// Inserto el coche
					contadorVehiculo++;// sumo al contador un coche
					vacio = true; // Lo vuelvo true por que se a ocupado con un coche
				}
			}
			if (vacio) {
				System.out.println("Se ha añadido el Vehiculo");
			}
		} else {
			System.out.println("El garaje esta completo.");
		}
	}

	// Dar de baja a un coche en cuestión.
	public void bajaCoche(Coche coche) {
		boolean fin = false;
		int pos = 0;
		int numCorredores = contarParticipantes();

		if (numCorredores == 0) {
			System.out.println("No quedan vehiculos para dar de baja.");
			fin = true;
		}

		while (fin == false && pos < vehiculo.length) {

			if (vehiculo[pos] != null) {
				if (vehiculo[pos].equals(coche)) {
					vehiculo[pos] = null;
					System.out.println("Se ha dado de baja el vehiculo.");
					fin = true;
				} else {
					pos++;
				}
			} else {
				pos++;
			}
		}
	}

	// Insertar el color de cada uno de los coches por teclado
	public void insertarColor(Coche coche, String color) {
		boolean fin = false;
		int pos = 0;
		int numCorredores = contarParticipantes();
		if (numCorredores == 0) {
			System.out.println("CARRERA VACIA!! No se puede eliminar ningun corredor");
			fin = true;
		}
		while (fin == false && pos < vehiculo.length) {

			if (vehiculo[pos] != null) {
				if (vehiculo[pos].equals(coche)) {
					vehiculo[pos].setColor(color);
					System.out.println("Se ha insertado el color.");
					fin = true;
				} else {
					pos++;
				}
			} else {
				pos++;
			}
		}
	}

	// Insertar el número de puertas de cada uno de los coches por teclado
	public void insertarNumPuertas(Coche coche, int numPuertas) {
		boolean fin = false;
		int pos = 0;
		while (fin == false && pos < vehiculo.length) {

			if (vehiculo[pos] != null) {
				if (vehiculo[pos].equals(coche)) {
					vehiculo[pos].setNumPuertas(numPuertas);
					System.out.println("Se ha insertado el color.");
					fin = true;
				} else {
					pos++;
				}
			} else {
				pos++;
			}
		}
	}

	/*
	 * El taller va a lanzar una oferta en la que determinamos si el coche tiene
	 * menos de 1000 kms, se le descuenta un 5% al precio del coche, si tiene entre
	 * 1000 kms y 5000 kms, se le descuenta un 10% al precio del coche. Determina un
	 * método que resuelva lo anterior y que muestre los nuevos precios.
	 */
	public void ofertas(Coche coche) {
		double precioOferta = 0;
		double descuento = 0;
		if (coche.getKm() < 1000) {
			descuento = coche.getPrecio() * 0.05;
			precioOferta = coche.getPrecio() - descuento;
			System.out.println("Oferta de 5% " + "\n-------------" + "\nPrecio Actual: " + coche.getPrecio() + "\nDescuento: " + descuento + "\nPrecio final: " + precioOferta  + "€");
		}
		if (coche.getKm() >= 1000 && coche.getKm() <= 5000) {
			descuento = coche.getPrecio() * 0.1;
			precioOferta = coche.getPrecio() - descuento;
			System.out.println("Oferta de 10% " + "\n-------------" + "\nPrecio Actual: " + coche.getPrecio() + "\nDescuento: " + descuento + "\nPrecio final: " + precioOferta + "€" );

		}
	}
	
	

}
