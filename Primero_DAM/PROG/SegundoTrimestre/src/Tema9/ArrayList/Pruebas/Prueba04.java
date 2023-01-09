package Tema9.ArrayList.Pruebas;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class Prueba04 {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(1);
		num.add(4);
		num.add(3);
		num.add(2);	
		
		Collections.sort(num);
		
		System.out.println("Datos de los numeros ordenados");
		
		for (int n: num) {
			System.out.println(n);
		}
		
		System.out.println();
		
		Collections.reverse(num);
		System.out.println("Datos de los numeros en orden inverso");	
		for (int n: num) {
			System.out.println(n);
		}
	}

}
