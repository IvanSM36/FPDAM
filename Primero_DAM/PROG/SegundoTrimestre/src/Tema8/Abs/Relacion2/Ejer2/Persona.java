package Tema8.Abs.Relacion2.Ejer2;

import javax.swing.AbstractAction;

public abstract class Persona {
	
	//Atributos
	protected int edad;
	protected String nombre;
	protected float salarioBaseDia;
	
	//Constructores
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, int edad, float salarioBaseDia) {
		this.edad = edad;
		this.nombre = nombre;
		this.salarioBaseDia = salarioBaseDia;
	}

	//Getters and Setters
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSalarioBaseDia() {
		return salarioBaseDia;
	}

	public void setSalarioBaseDia(float salarioBaseDia) {
		this.salarioBaseDia = salarioBaseDia;
	}

	//Metodos
	
	public abstract int calcularHoraSem();
	
	public abstract float salarioMes();	
}
