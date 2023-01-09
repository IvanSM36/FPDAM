package Examen.T7POO.Ejer01;

public class Corredor {

	// ATRIBUTOS

		private String nombre;
		private String apellido1;
		private String apellido2;
		private int edad;
		private String sexo;
		private int marca;

	// CONSTRUCTORES

		public Corredor(String nombre, String apellido1, String apellido2, int edad, String sexo) {
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.edad = edad;//Prueba
			this.sexo = sexo.toLowerCase();
		}

	// GETTERS Y SETTERS

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido1() {
			return apellido1;
		}

		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}

		public String getApellido2() {
			return apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public int getMarca() {
			return marca;
		}

		public void setMarca(int marca) {
			this.marca = marca;
		}

	}