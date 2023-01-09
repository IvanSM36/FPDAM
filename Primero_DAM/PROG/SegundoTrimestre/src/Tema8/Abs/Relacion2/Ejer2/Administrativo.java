package Tema8.Abs.Relacion2.Ejer2;

public class Administrativo extends Persona {
	// Atributos
	// null

	// Constructores
	// Por defecto
	public Administrativo() {
		// TODO Auto-generated constructor stub
	}
	
	public Administrativo(String nombre, int edad, float salarioBaseDia) {
		super(nombre, edad, salarioBaseDia);
	}

	
	//Getters and Setters
	//Null
	
	//Metodos
	@Override
	public int calcularHoraSem() {
		int horasDiariasTrabajadas = 5;
		int diasLaborales = 5;
		int horasSemanales = horasDiariasTrabajadas * diasLaborales; 	
		return horasSemanales;		
	}

	@Override
	public float salarioMes() {
		float salarioBaseProfesorDia = salarioBaseDia / 2; //Administrativo es la mitad del salario base de un dia
		int semanasAlMes = 4;
		float salarioMes = (calcularHoraSem() * semanasAlMes) * salarioBaseProfesorDia;
		return salarioMes;

	}

	public String toString() {
		return "Administrativo " + nombre + "\n--------------------" + "\nNombre: " + nombre + "\nEdad: " + edad +  "\nSalarioBaseDia: " + salarioBaseDia
				+ "\nHoras semanales: " + calcularHoraSem() + "\nSalario al mes: " + salarioMes();
	}
	
}
