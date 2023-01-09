package Tema9.ArrayList.Pruebas;
import java.util.ArrayList
;
public class Prueba02 {

	public static void main(String[] args) {

		ArrayList<Integer>  num = new ArrayList<Integer>();
		
		num.add(20);
		num.add(8);
		num.add(15);
		num.add(6);
		num.add(36);
		num.add(5);
		
		System.out.println("Contenido de la lista: ");
		System.out.println(num);
		
		num.removeIf(numero -> (numero % 3 == 0));
		System.out.println("Contenido de la lista despues de borrar los multiplos de 3");
		System.out.println(num);
	}

}
