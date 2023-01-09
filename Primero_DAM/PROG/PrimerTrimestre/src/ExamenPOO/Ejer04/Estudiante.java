package ExamenPOO.Ejer04;

public class Estudiante {
	
	// Atributos
	private int id;
	private String name;
	private int age;
	private int nota;

	// Constructores
	public Estudiante(int id, String name, int age, int nota) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.nota = nota;
	}
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
}
