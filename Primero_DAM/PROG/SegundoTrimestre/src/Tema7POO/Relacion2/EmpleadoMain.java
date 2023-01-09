 /**
 * 
 */
package Tema7POO.Relacion2;

/**
 * @author IvanSM
 *
 */
public class EmpleadoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Empleado e1 = new Empleado("sdfwea", 50, 2, 4, 10, true, 2);
		
		System.out.println(e1);
		
		System.out.println("Calculo de horas extras");
		System.out.println(e1.calculoHorasEx(e1));
		System.out.println("Calculo sueldo bruto");
		System.out.println(e1.calculoSueldoBruto(e1));
		System.out.println("Calculo irpf");
		System.out.println(e1.calculoDevIrpf(e1));
	}

}
