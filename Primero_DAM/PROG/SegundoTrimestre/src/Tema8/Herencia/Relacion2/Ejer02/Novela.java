package Tema8.Herencia.Relacion2.Ejer02;

import java.util.Arrays;

public class Novela extends Libro{
	
	private String[] tipos = { "Historia", "Romantica", "Policiaca", "Realista", "Ciencia Ficcion", "Aventura"};
	protected String tipo; 

	public Novela() {

	}

	public Novela(String titulo, String autor, String tipo) {
		super(titulo, autor);	
		for(int i = 0; i < tipos.length; i++) {
			if(!tipo.equals(tipos[i])) {
				tipo = "Aventura";
			}
		}
		this.tipo = tipo;		
	}
	
	//Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		for(int i = 0; i < tipos.length; i++) {
			if(!tipo.equals(tipos[i])) {
				tipo = "Aventura";
			}
		}
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNovela [tipo=" + tipo + "]";
	}

	
	
}
