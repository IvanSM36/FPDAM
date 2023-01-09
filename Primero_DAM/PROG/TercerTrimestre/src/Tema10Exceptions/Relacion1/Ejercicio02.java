package Tema10Exceptions.Relacion1;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Ejercicio02Gato gato1 = new Ejercicio02Gato("Garfield", "macho");
		Ejercicio02Gato gato2 = new Ejercicio02Gato("Tom", "macho");
		Ejercicio02Gato gato3 = new Ejercicio02Gato("Lisa", "hembra");
		
		try {
			gato2.aparearCon(gato3);
			gato1.aparearCon(gato2);


		} catch(Ejercicio02ExceptionPropio ep) {
			System.out.println("No se pueden aparear, son del mismo sexo.");
		}
	}

}
