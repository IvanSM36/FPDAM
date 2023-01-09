/**
 * 
 */
package Tema7POO.Relacion1;

/**
 * @author IvanSM
 *
 */
public class Agenda {

	// Atributos
	private Contactos[] contacto;

	// Constructores
	public Agenda() {
		this.contacto = new Contactos[10]; // por defecto
	}

	public Agenda(int tamanio) {
		this.contacto = new Contactos[tamanio]; // tamaño que pide el usuario
	}

	// Getters and Setters
	public Contactos[] getContacto() {
		return contacto;
	}

	public void setContacto(Contactos[] contacto) {
		this.contacto = contacto;
	}

	// Metodos
	public void añadirContacto(Contactos c) {
		if (existeContacto(c)) { // compruebo si existe el contacto
			System.out.println("El contacto con ese nombre ya existe");
		} else if (agendaLlena()) { // Compruebo que la agenda no esté llena
			System.out.println("La agenda está llena");
		} else {
			boolean buscarUnHueco = false; // para buscar un hueco vacio en la agenda
			for (int i = 0; i < contacto.length && !buscarUnHueco; i++) {
				if (contacto[i] == null) { // controlo nulos
					contacto[i] = c; // Inserto el contacto
					buscarUnHueco = true; // indico que lo he encontrado
				}
			}
			if (buscarUnHueco) {
				System.out.println("Se ha añadido el contacto.");
			} else {
				System.out.println("No se ha podido añadir.");
			}

		}
	}

	public boolean existeContacto(Contactos c) {
		for (int i = 0; i < contacto.length; i++) {
			// Controlo nulos e indico si el contacto es el mismo
			if (contacto[i] != null && c.equals(contacto[i])) {
				return true;
			}
		}
		return false;
	}

	public void listarContacto() {
	/*	if (huecosLibre() == contacto.length) {
			System.out.println("No hay contactos que mostrar.");
		} else {
			for (int i = 0; i < contacto.length; i++) {
				if (contacto[i] != null) {
					System.out.println(contacto[i]);
				}
			}
		}*/
	}

	public void buscaContacto() {

	}

	public void eliminarContacto(Contactos c) {
		boolean encontrado = false;
        for (int i = 0; i < contacto.length && !encontrado; i++) {
            if (contacto[i] != null && contacto[i].equals(c)) {
                contacto[i] = null; //Controlo nulos
                encontrado = true; //Indico que lo he encontrado
            }
        }
 
        if (encontrado) {
            System.out.println("Se ha eliminado el contacto");
        } else {
            System.out.println("No se ha eliminado el contacto");
 
        }
	}

	public boolean agendaLlena() {
		for (int i = 0; i < contacto.length; i++) {
			if (contacto[i] == null) { // Controlo nulos
				return false; // indico que no esta llena
			}
		}
		return true; // Está llena
	}
	/**
     * Indica cuantos contactos más podemos meter
     *
     * @return
     */
    public int huecosLibre() { 
        int contadorLibres = 0;
        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] == null) { //Controlo nulos
                contadorLibres++; //Acumulo
            }
        }
 
        return contadorLibres;
    }
    
    /**
     * Busca un contacto por su nombre
     *
     * @param nombre
     */
    public void buscarPorNombre(String nombre) {
 
        boolean encontrado = false;
        for (int i = 0; i < contacto.length && !encontrado; i++) {
            //Controlo nulos y cxompruebo que es el contacto buscado (forma mas engorrosa)
            if (contacto[i] != null && contacto[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("Su telefono es " + contacto[i].getTelefono()); //muestro el telefono
                encontrado = true; //Indico que lo he encontrado
            }
        }
 
        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }
 
    }
    
	 /**
     * Lista los contactos de la agenda
     */
    public void listarContactos() {
 
        if (huecosLibre() == contacto.length) {
            System.out.println("No hay contactos que mostrar");
        } else {
            for (int i = 0; i < contacto.length; i++) {
                if (contacto[i] != null) { //Controlo nulos
                    System.out.println(contacto[i]);
                }
            }
        }
 
    }
}
