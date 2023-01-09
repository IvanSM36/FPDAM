package Tema10Ficheros.Relacion1;

import java.util.ArrayList;

public class Agenda {

	// Atributo
	private ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();

	// Constructores
	public Agenda() {

	}

	public Agenda(ArrayList<Contacto> listaContactos) {
		this.listaContactos = listaContactos;
	}

	// Getters and Setters
	public ArrayList<Contacto> getListaContactos() {
		return listaContactos;
	}

	public void setListaContactos(ArrayList<Contacto> listaContactos) {
		this.listaContactos = listaContactos;
	}

	// Metodos

	public void agregarContacto(Contacto c) {
		listaContactos.add(c);
	}

	public void eliminarContacto(String nombre) {
		listaContactos.remove(nombre);
	}

	public void mostrarContactos() {
		for(int i = 0; i < listaContactos.size(); i++) {
			System.out.println(listaContactos.get(i));
		}
	}

}
