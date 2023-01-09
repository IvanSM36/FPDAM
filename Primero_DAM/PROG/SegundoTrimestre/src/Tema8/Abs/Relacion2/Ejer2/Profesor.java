package Tema8.Abs.Relacion2.Ejer2;

public class Profesor extends Persona {

	//Atributos
	//null
	
	//Constructores
	//Por defecto
	public Profesor() {

	}
	
	public Profesor(String nombre, int edad, float salarioBaseDia) {
		super(nombre, edad, salarioBaseDia);
	}
	
	//Getters and Setters
	//null

	
	//	Metodos
	@Override
	public int calcularHoraSem() {
		int horasDiariasTrabajadas = 8;
		int diasLaborales = 5;
		int horasSemanales = horasDiariasTrabajadas * diasLaborales; 	
		return horasSemanales;
	}

	@Override
	public float salarioMes() {
		float salarioBaseProfesorDia = salarioBaseDia * 2;
		int semanasAlMes = 4;
		float salarioMes = (calcularHoraSem() * semanasAlMes) * salarioBaseProfesorDia;
		return salarioMes;
	}

	@Override
	public String toString() {
		return "Profesor " + nombre + "\n------------------" + "\nNombre: " + nombre + "\nEdad: " + edad + "\nSalarioBaseDia: " + salarioBaseDia
				+ "\nHoras semanales: " + calcularHoraSem() + "\nSalario al mes: " + salarioMes();
	}

	
}
