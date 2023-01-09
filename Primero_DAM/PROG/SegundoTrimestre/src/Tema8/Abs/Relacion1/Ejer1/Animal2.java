package Tema8.Abs.Relacion1.Ejer1;

public abstract class Animal2 {
	
	//Atributos
	protected String sonido;
	protected String alimentos;
	protected String habitat;
	protected String nomCientifico;
	
	//Constructores
	public Animal2(String sonido, String alimentos, String habitat, String nomCientifico) {
		this.sonido = sonido;
		this.alimentos = alimentos;
		this.habitat = habitat;
		this.nomCientifico = nomCientifico;
	}
	
	//Getters and Setters 	
	public abstract String getSonido();

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}	
	
	public abstract String getAlimentos();

	public void setAlimentos(String alimentos) {
		this.alimentos = alimentos;
	}

	public abstract String getHabitat();

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public abstract String getNomCientifico();

	public void setNomCientifico(String nomCientifico) {
		this.nomCientifico = nomCientifico;
	}



	

}
