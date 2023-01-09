package Tema9.ArrayList.Relacion2.Ejer06;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<>();

		Empleado e1 = new Empleado("fer1", "ure1", 60, 1500);
		Empleado e2 = new Empleado("fer2", "ure2", 50, 2000);
		Empleado e3 = new Empleado("fer3", "ure3", 42, 1000);

		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);

		Collections.sort(empleados);

		for (Empleado aux : empleados) {
			System.out.println(aux);
		}
	}

}
