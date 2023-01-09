package ExamenPOO.Ejer04;

public class TodosEstudiantes {

	// Atributos
	Estudiante[] estudianteArray;
	private int contadorEstudiantes = 0;

	// Constructores
	public TodosEstudiantes() {
		this.estudianteArray = new Estudiante[5];
	}

	// Metodos
	public void agregaEstudiante(Estudiante x) {
		boolean vacio = false;

		if (contadorEstudiantes < estudianteArray.length) {
			for (int i = 0; i < estudianteArray.length && !vacio; i++) {
				if (estudianteArray[i] == null) { // controlo los nulos
					estudianteArray[i] = x;// Inserto la cancion
					contadorEstudiantes++;// sumo al contador una cancion
					vacio = true; // Indico que lo he encontrado
				}
			}

			if (vacio) {
				System.out.println("Se ha añadido");
			}
		} else {
			System.out.println("Solo admitimos 5 estudiantes");
		}
	}

	public void mostrarNombre(int posicion) {
		posicion = posicion - 1;
		if (posicion < estudianteArray.length && estudianteArray[posicion] != null) {
			System.out.println("El estudiante de la posicion indicada es " + estudianteArray[posicion].getName());
		} else {
			System.out.println("Esa posición esta vacia o no existe");
		}

	}

	public void mostrarNota(int posicion) {
		posicion = posicion - 1;
		if (posicion < estudianteArray.length && estudianteArray[posicion] != null) {
			System.out.println("La nota del estudiante es " + estudianteArray[posicion].getNota());
			if (estudianteArray[posicion].getNota() >= 5) {
				System.out.println("El estudiante " + estudianteArray[posicion].getName() + " ha aprobado");
			} else {
				System.out.println("El estudiante " + estudianteArray[posicion].getName() + " ha suspendido");
			}
		} else {
			System.out.println("Esa posición esta vacia o no existe");
		}

	}

}
