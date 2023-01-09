package Tema9.ArrayList.Relacion1Ejer10;


import java.util.ArrayList;

public class Sucursal {
	//atributos
	protected String nombre;
	protected ArrayList <Instrumento> misinstrumentos;
	//contructor
	Sucursal(String nombre) {
		this.nombre=nombre;
		this.misinstrumentos=new ArrayList <Instrumento> ();
	}
	//metodo
	protected void listarInstrumentos() {
		System.out.println(misinstrumentos);
	}
	protected void instrumentoPortipo(Tipo tipo) {
		for(int i=0;i<this.misinstrumentos.size();i++) {
			if(this.misinstrumentos.get(i).getTipo().equals(tipo)) {
				System.out.print(this.misinstrumentos.get(i)+" ");
			}
		}
		System.out.println();
	}
	protected void borrarInstrumento(String id) {
		for(int i=0;i<this.misinstrumentos.size();i++) {
			if(this.misinstrumentos.get(i).getId().equals(id)) {
				this.misinstrumentos.remove(i);
				i=this.misinstrumentos.size()+1;
			}
		}
	}
	protected void añadir(Instrumento n) {
		boolean esta=false;
	
		for(int i=0;i<this.misinstrumentos.size();i++) {
			if(this.misinstrumentos.get(i).getId().equals(n.getId())) {
				esta=true;
				
			}
		}
		if(esta) {
			System.out.println("Ya hay un instrumento con ese id");
		}else {
			misinstrumentos.add(n);
			System.out.println("Intrumento añadido");
		}
	}
	public void imprimir() {
		System.out.println(misinstrumentos);
	}
	
	//metodo get and set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
