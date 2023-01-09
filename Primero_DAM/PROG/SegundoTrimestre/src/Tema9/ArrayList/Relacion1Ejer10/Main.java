package Tema9.ArrayList.Relacion1Ejer10;

public class Main {

	public static void main(String[] args) {
		Fabrica fabrica = new Fabrica();
		Sucursal s = new Sucursal("Prueba");
		Instrumento ins1 = new Instrumento("14150", 352.254, Tipo.CUERDA);
		Instrumento ins2 = new Instrumento("1415dd0", 352.254, Tipo.VIENTO);
		Instrumento ins3 = new Instrumento("14KMJFSK150", 352.254, Tipo.PERCUSION);
		Instrumento ins14 = new Instrumento("141lemkklkfm50", 352.254, Tipo.CUERDA);
		Instrumento ins25 = new Instrumento("1415dkwjfkwjd0", 352.254, Tipo.VIENTO);
		Instrumento ins36 = new Instrumento("14KMJlkwlkcFSK150", 352.254, Tipo.PERCUSION);
		s.añadir(ins3);
		s.añadir(ins2);
		s.añadir(ins1);
		s.añadir(ins36);
		s.añadir(ins25);
		s.añadir(ins14);
		s.listarInstrumentos();
		s.instrumentoPortipo(Tipo.VIENTO);
		s.borrarInstrumento("14150");
		fabrica.añadir(s);
		fabrica.porcInstrumentoTipo("Prueba");
	}

}
