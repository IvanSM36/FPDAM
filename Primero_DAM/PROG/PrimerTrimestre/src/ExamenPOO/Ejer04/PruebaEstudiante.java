package ExamenPOO.Ejer04;

public class PruebaEstudiante {

	public PruebaEstudiante() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante estudiante1 = new Estudiante(1, "Jose", 23, 9);
		Estudiante estudiante2 = new Estudiante(2, "Alberto", 24, 2);
		Estudiante estudiante3 = new Estudiante(3, "Carlos", 24, 7);
		Estudiante estudiante4 = new Estudiante(4, "Álvaro", 23, 8);
		Estudiante estudiante5 = new Estudiante(5, "Daniel", 23, 9);
		
		TodosEstudiantes todosEstudiantes = new TodosEstudiantes();
		todosEstudiantes.agregaEstudiante(estudiante1);
		todosEstudiantes.agregaEstudiante(estudiante2);
		todosEstudiantes.agregaEstudiante(estudiante3);
		todosEstudiantes.agregaEstudiante(estudiante4);
		todosEstudiantes.agregaEstudiante(estudiante5);
		
		todosEstudiantes.mostrarNombre(3);
		
		todosEstudiantes.mostrarNota(2);
		todosEstudiantes.mostrarNota(1);
	}

}
