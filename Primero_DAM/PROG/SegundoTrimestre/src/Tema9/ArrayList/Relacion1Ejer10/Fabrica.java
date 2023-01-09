package Tema9.ArrayList.Relacion1Ejer10;
import java.util.ArrayList;

public class Fabrica {
	//atributo
	protected ArrayList <Sucursal> sucursales;
	//contructor
	Fabrica(){
		this.sucursales=new ArrayList <Sucursal> ();
	}
	//metodo
	protected void añadir(Sucursal s) {
		sucursales.add(s);
	}
	protected void porcInstrumentoTipo(String nombre) {
		int sumaPercusion=0;
		int sumaViento=0;
		int sumaCuerda=0;
		int sumaTotal=0;
		for(int i=0;i<this.sucursales.size();i++) {
			if(this.sucursales.get(i).getNombre().equals(nombre)) {
				for(int d=0;d<this.sucursales.get(i).misinstrumentos.size();d++) {
					
					if(this.sucursales.get(i).misinstrumentos.get(d).getTipo().equals(Tipo.PERCUSION)) {
						sumaPercusion+=1;
						sumaTotal+=1;
						
						
					}else if(this.sucursales.get(i).misinstrumentos.get(d).getTipo().equals(Tipo.VIENTO)) {
						sumaViento+=1;
						sumaTotal+=1;
						
					}else if(this.sucursales.get(i).misinstrumentos.get(d).getTipo().equals(Tipo.CUERDA)) {
						sumaCuerda+=1;
						sumaTotal+=1;
						
					}
				}
			}
		}
		double porPer=sumaPercusion*100/sumaTotal;
		double porViento=sumaViento*100/sumaTotal;
		double porCuerda=sumaCuerda*100/sumaTotal;
		System.out.println("Porcentaje de percusion es "+porPer);
		System.out.println("Porcentaje de Viento es "+porViento);
		System.out.println("Porcentaje de cuerda es "+porCuerda);
	}
}
